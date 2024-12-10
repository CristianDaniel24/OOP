package herencia.abstraccion.ejercicio4.entities;

public class Refrigerator extends Appliance{

    private int capacity;

    public Refrigerator(String marca, String modelo,int capacity){
        super(marca,modelo);
        this.capacity = capacity;
    }
    public void turnOn(){
        System.out.println("Refrigerador encendido");
    }
    public void turnOff(){
        System.out.println("Refrigerador apagado");
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("La Capacidad de el Refrigerador es: "+this.capacity);
    }
}
