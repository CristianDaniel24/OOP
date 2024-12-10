package herencia.abstraccion.ejercicio1.entities;

public class AnimalCarnivoro extends Animal{

    @Override
    public void comer(){
        System.out.println("ANIMALES CARNIVOROS🦁");
        System.out.println("¿Los animales carnivoros de que se alimentan?");
        System.out.println("Los animales carnivoros comen carne");
    }
    @Override
    public void dormir(){
        System.out.println("¿Los animales carnivoros duermen?");
        System.out.println("Los animales carnivoros si duermen");
        System.out.println(" ");
    }
}
