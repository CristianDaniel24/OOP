package herencia.abstraccion.ejercicio4.entities;

public abstract class Appliance {
    protected String marca;
    protected String modelo;

    public Appliance(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void displayDetails() {
        System.out.println("Los detalles de el electrodomestico son:" +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo);
    }
}