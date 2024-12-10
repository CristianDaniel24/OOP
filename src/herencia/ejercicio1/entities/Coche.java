package herencia.ejercicio1.entities;

public class Coche extends Vehiculo{
    private int puertas;

    public Coche(int fecha, String modelo, int puertas){
        super(fecha, modelo);
        this.puertas = puertas;
    }
    public void detallesPersonalizado(){
        System.out.println("\nEl coche es del " + this.getFecha()+" y su modelo es "+ this.getModelo());
        System.out.println("El coche tiene " + this.puertas+ " puertas");
    }
    @Override
    public void detalles() {
        super.detalles();
        System.out.println("El coche tiene " + this.puertas+ " puertas");
    }
}