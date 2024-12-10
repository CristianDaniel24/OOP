package dataStructures.ejercicio4;

public class Computer {
    private String name;
    private Double precio;
    private int reference;

    public Computer(String name, Double precio, int reference) {
        this.name = name;
        this.precio = precio;
        this.reference = reference;
    }

    public Computer() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getReference() {
        return this.reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
