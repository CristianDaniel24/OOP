package herencia.abstraccion.ejercicio3.entities;

public abstract class Item {
    protected String titulo;
    protected String id;

    public Item(String titulo, String id){
        this.titulo = titulo;
        this.id = id;
    }
    public abstract void displayDetails();

    public abstract int getBorrowingPeriod();

}
