package herencia.ejercicio1.entities;

public class Vehiculo {
    private int fecha;
    private String modelo;

    public Vehiculo(int fecha,String modelo){
        this.fecha = fecha;
        this.modelo = modelo;
    }
    public int getFecha() {
        return this.fecha;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void detalles(){
            System.out.println("\nLos detalles de cada vehiculo son:");
            System.out.println("La fecha es: "+fecha+"\nEl modelo es: "+modelo);
    }
}