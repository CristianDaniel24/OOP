package practicaOOP;

public class Coche extends Vehiculo implements Mantenimiento {
    private int puertas;

    // Sobrecarga de constructores
    public Coche(String marca, String modelo, int year, int puertas) {
        super(marca, modelo, year);
        this.puertas = puertas;
    }

    public Coche(String marca, String modelo) {
        super(marca, modelo, 2020); // Año por defecto
        this.puertas = 4; // Puertas por defecto
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year + ", Puertas: " + puertas);
    }

    @Override
    public double calcularCostoMantenimiento() {
        return puertas * 50.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + puertas;
    }
}
