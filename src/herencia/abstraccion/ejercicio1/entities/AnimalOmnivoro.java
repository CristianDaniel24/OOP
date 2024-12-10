package herencia.abstraccion.ejercicio1.entities;

public class AnimalOmnivoro extends Animal{

    @Override
    public void comer(){
        System.out.println("ANIMALES OMNIVOROS🌾");
        System.out.println("¿Los animales Omnivoros de que se alimentan?");
        System.out.println("Los animales Omnivoros en general comen de todo");
    }
    @Override
    public void dormir(){
        System.out.println("¿Los animales Omnivoros duermen?");
        System.out.println("Los animales Omnivoros si duermen");
    }
}