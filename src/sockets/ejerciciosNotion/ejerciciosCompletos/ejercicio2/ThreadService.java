package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio2;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThreadService extends Thread {
    public static final String PATH = "src/sockets/ejerciciosNotion/ejerciciosCompletos/ejercicio2/Libro.txt";
    private final Socket client;
    private List<Book> books;

    public ThreadService(Socket client) {
        this.client = client;
        this.books = new LinkedList<>();
    }

    @Override
    public void run() {
        try (DataInputStream in = new DataInputStream(client.getInputStream());
             DataOutputStream out = new DataOutputStream(client.getOutputStream())) {

            List<String> lines = Files.readAllLines(Path.of(PATH));

            books = lines.stream()
                    .map(line -> {
                        String[] data = line.split(",");
                        return new Book(data[0].trim(), data[1].trim(), Integer.parseInt(data[2].trim()));
                    }).collect(Collectors.toList());

            while (this.client.isConnected()) {
                String operation = in.readUTF();
                System.out.println("[INFO] - Input operation: " + operation);

                if (operation.equalsIgnoreCase("EXIT")) {
                    System.out.println("[INFO] - Client disconnected");
                    break;
                } else if (operation.equalsIgnoreCase("addBook")) {
                    System.out.println("add Book");
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true))) {
                        ObjectInputStream inObject = new ObjectInputStream(client.getInputStream());

                        Book book = (Book) inObject.readObject();
                        Optional<Book> optionalExistBook = books.stream()
                                .filter(books -> books.getTitle().equals(book.getTitle()) && books.getAutor().equals(book.getAutor()))
                                .findFirst();

                        if (optionalExistBook.isPresent()) {
                            Book bookFounAdd = optionalExistBook.get();
                            System.out.println("[INFO] - The book: " + bookFounAdd + " exists");
                            out.writeUTF("ERROR - Book already exists");
                        } else {
                            writer.write(book.toString() + System.lineSeparator());
                            writer.close();
                            System.out.println("[INFO] - The book was added successfully");
                            out.writeUTF("The book was added successfully");
                            books.add(book);
                        }
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } else if (operation.equalsIgnoreCase("editBook")) {
                    System.out.println("[INFO] - Edit book");
                    ObjectOutputStream outObjec = new ObjectOutputStream(client.getOutputStream());
                    ObjectInputStream inObjec = new ObjectInputStream(client.getInputStream());

                    //Retornarle una lista al usuario con la lista de los libros
                    outObjec.writeObject(books);

                    String input = in.readUTF();
                    if (input.equals("Yes")) {
                        List<Book> bookUpdate = (List<Book>) inObjec.readObject();
                        books = bookUpdate;
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, false))) {

                            bookUpdate.stream()
                                    .map(Book::toString)
                                    .forEach(line -> {
                                        try {
                                            writer.write(line + System.lineSeparator());
                                        } catch (IOException e) {
                                            throw new RuntimeException(e);
                                        }
                                    });
                            System.out.println("[INFO] - Books Update");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("[INFO] - Index invalid");
                    }
                } else if (operation.equalsIgnoreCase("searchBook")) {
                    System.out.println("[INFO] - Searching book..");
                    String inputClient = in.readUTF();
                    System.out.println("[INFO] - Input client: " + inputClient);

                    Optional<List<Book>> optionalBook = Optional.of(books.stream()
                            .filter(book -> book.getTitle().startsWith(inputClient))
                            .collect(Collectors.toList()));
                    ObjectOutputStream outObject = new ObjectOutputStream(client.getOutputStream());

                    try {
                        List<Book> booksList = optionalBook.get();
                        System.out.println("[INFO] - Books list found: " + booksList);
                        outObject.writeObject(booksList);
                    } catch (NoSuchElementException e) {
                        System.out.println("[INFO] - Not book found");
                        System.out.println("Not found");
                        throw new RuntimeException(e);
                    }

                } else if (operation.equalsIgnoreCase("listBooks")) {
                    System.out.println("[INFO] - Print books");
                    ObjectOutputStream outObject = new ObjectOutputStream(client.getOutputStream());
                    outObject.writeObject(books);
                }
            }
        } catch (SocketException e) {
            System.out.println("[INFO] - Client disconnected");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
