package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio2;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String autor;
    private int amount;

    public Book(String title, String autor, int amount) {
        this.title = title;
        this.autor = autor;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return title + "," + autor + "," + amount;
    }
}
