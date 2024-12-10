package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio2;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class Client {
    //Se usa en contextos especiales
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (Socket socket = new Socket("127.0.0.1", 7070)) {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            boolean exit = false;
            while (!exit) {
                try {
                    System.out.println("\nMenu biblioteca");
                    System.out.println("1. Add book");
                    System.out.println("2. Edit book");
                    System.out.println("3. Search book");
                    System.out.println("4. List book");
                    System.out.println("5. Exit");
                    System.out.println("Enter the option:");
                    int option = Integer.parseInt(reader.readLine());
                    if (option == 1) {
                        //Se crea la instancia del book para que el usuario ingrese los datos y asi crear un libro para luego enviarlo al ThreadService y guardarlo en el txt
                        out.writeUTF("addBook");
                        ObjectOutputStream obj = new ObjectOutputStream(socket.getOutputStream());
                        System.out.println("Enter the title of the book:");
                        String inputTitle = reader.readLine();
                        System.out.println("Enter the author of the book:");
                        String inputAuthor = reader.readLine();
                        System.out.println("Enter the stock of books");
                        int inputStock = Integer.parseInt(reader.readLine());

                        Book book = new Book(inputTitle, inputAuthor, inputStock);
                        obj.writeObject(book);
                        System.out.println(in.readUTF());
                    } else if (option == 2) {
                        out.writeUTF("editBook");
                        ObjectInputStream inObj = new ObjectInputStream(socket.getInputStream());
                        ObjectOutputStream outObj = new ObjectOutputStream(socket.getOutputStream());
                        //Se recibe la lista del servidor con los libros
                        List<Book> listBooks = (List<Book>) inObj.readObject();

                        //Se imprimen los libros al cliente usando el FOR I se le resta 1 al indice para ponerlos bien
                        System.out.println("\nBooks:");
                        for (int i = 0; i < listBooks.size(); i++) {
                            System.out.printf("%d. %s%n", i + 1, listBooks.get(i));
                        }
                        //Se le pregunta al usuario el indice de el libro que quiere editar
                        System.out.println("Enter the index of book for edit:");
                        int indexBook = Integer.parseInt(reader.readLine());
                        //Se hace la condicion por si ingresa un indice invalido
                        if (listBooks.get(indexBook) != null) {
                            out.writeUTF("Yes");
                            //Si ingresa bien entonces se le pregunta los nuevos datos del libro
                            Book bookUpdate = listBooks.get(indexBook - 1);

                            System.out.println("Enter the new title:");
                            String newTitle = reader.readLine();
                            bookUpdate.setTitle(newTitle);
                            System.out.println("Enter the new autor:");
                            String newAutor = reader.readLine();
                            bookUpdate.setAutor(newAutor);
                            System.out.println("Enter the new stock:");
                            int newStock = Integer.parseInt(reader.readLine());
                            bookUpdate.setAmount(newStock);
                            System.out.println("\nBooks update:");
                            for (int i = 0; i < listBooks.size(); i++) {
                                System.out.printf("%d. %s%n", i + 1, listBooks.get(i));
                            }
                            //Se envia el libro al servidor
                            outObj.writeObject(listBooks);
                        } else {
                            out.writeUTF("Not");
                            System.out.println("The index is invalid");
                        }
                    } else if (option == 3) {
                        out.writeUTF("searchBook");
                        System.out.println("Enter the title of book to search:");
                        String titleInput = reader.readLine();
                        out.writeUTF(titleInput);
                        ObjectInputStream inObject = new ObjectInputStream(socket.getInputStream());
                        List<Book> books = (List<Book>) inObject.readObject();

                        if (books.isEmpty()) {
                            System.out.println("Not found");
                        } else {
                            System.out.println("\nThe Books found are:");
                            books.forEach(System.out::println);
                        }
                    } else if (option == 4) {
                        out.writeUTF("listBooks");
                        ObjectInputStream inObject = new ObjectInputStream(socket.getInputStream());

                        List<Book> books = (List<Book>) inObject.readObject();
                        System.out.println("\nThe books are:");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.printf("%d. %s%n", i + 1, books.get(i));
                        }
                    } else if (option == 5) {
                        out.writeUTF("EXIT");
                        System.out.println("Exit..");
                        exit = true;
                    } else {
                        System.out.println("The option is invalid");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter the number, please");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
