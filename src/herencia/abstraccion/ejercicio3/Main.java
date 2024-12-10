package herencia.abstraccion.ejercicio3;

import herencia.abstraccion.ejercicio3.entities.Book;
import herencia.abstraccion.ejercicio3.entities.DVD;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("El principito","1","Jorge",150,"Ficcion"));
        books.add(new Book("El zorro","2","Carlos",200,"Terror"));

        ArrayList<DVD> dvds = new ArrayList<DVD>();
        dvds.add(new DVD("Jorge el curioso","1","Jorge padilla",2,"Infantil"));
        dvds.add(new DVD("Pinocho","2","Nicochela",1,"Infantil"));

        for (Book book : books){
            book.displayDetails();
            book.borrowItem();
            System.out.println("El periodo de entrega es: "+book.getBorrowingPeriod()+" Años");
            book.returnItem();
            System.out.println(" ");
        }
        for (DVD dvd : dvds){
            dvd.displayDetails();
            dvd.borrowItem();
            System.out.println("El periodo es: "+dvd.getBorrowingPeriod()+" Años");
            dvd.returnItem();
            System.out.println(" ");
        }
    }
}