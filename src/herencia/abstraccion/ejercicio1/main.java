package herencia.abstraccion.ejercicio1;

import herencia.abstraccion.ejercicio1.entities.AnimalCarnivoro;
import herencia.abstraccion.ejercicio1.entities.AnimalOmnivoro;
import herencia.abstraccion.ejercicio1.entities.Planta;

public class main {
    public static void main(String[] args){
        Planta planta = new Planta();
        planta.comer();
        planta.dormir();

        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        animalCarnivoro.comer();
        animalCarnivoro.dormir();

        AnimalOmnivoro animalOmnivoro = new AnimalOmnivoro();
        animalOmnivoro.comer();
        animalCarnivoro.dormir();
        animalCarnivoro.respirar();
    }
}