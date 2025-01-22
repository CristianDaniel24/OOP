package practicaOOP;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int year;

    // Constructor basico
    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    // Constructor sin parametros
    public Vehiculo() {
    }

    // Metodo abstracto para mostrar informacion
    public abstract void mostrarInfo();

    // Metodo comun para todos los vehiculos
    public int calculateYear(int currentYear) {
        return currentYear - this.year;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year;
    }
}
