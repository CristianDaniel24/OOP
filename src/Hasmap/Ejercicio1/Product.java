package Hasmap.Ejercicio1;

public class Product {
    private int id;
    private String nombre;
    private double precio;

    public Product(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nProduct: " + "id:" + id + ", name:'" + nombre + '\'' + ", price:" + precio;
    }
}
