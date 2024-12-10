package herencia.abstraccion.ejercicio4.entities;

public class WashingMachine extends Appliance{

    private int loadCapacity;

    public WashingMachine(String marca, String modelo,int loadCapacity){
        super(marca,modelo);
        this.loadCapacity = loadCapacity;
    }
    public void turnOn(){
        System.out.println("Lavadora encendida");
    }
    public void turnOff(){
        System.out.println("Lavadora apagada");
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("La Capacidad de la Lavadora es: "+this.loadCapacity);

    }
}
