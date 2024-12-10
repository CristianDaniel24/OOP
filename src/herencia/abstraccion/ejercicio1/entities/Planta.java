package herencia.abstraccion.ejercicio1.entities;

public class Planta extends Servivo{

    @Override
    public void comer(){
        System.out.println("PLANTAS🌱");
        System.out.println("¿Las plantas se alimentan?");
        System.out.println("Las plantas se alimenta gracias a la Fotosintesis");
    }
    @Override
public void dormir(){
        System.out.println("¿Las plantas duermen?");
        System.out.println("Las plantas no duermen como tal pero sí poseen un ritmo circadiano");
        System.out.println(" ");
    }
}