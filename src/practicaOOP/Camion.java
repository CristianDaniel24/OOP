package practicaOOP;

public class Camion extends Vehiculo implements Mantenimiento {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int year, double capacidadCarga) {
        super(marca, modelo, year);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camion - Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year + ", Capacidad de carga: " + capacidadCarga + " toneladas");
    }

    @Override
    public double calcularCostoMantenimiento() {
        return capacidadCarga * 200.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de carga: " + capacidadCarga + " toneladas";
    }
}
