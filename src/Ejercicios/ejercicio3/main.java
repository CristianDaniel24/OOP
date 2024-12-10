package Ejercicios.ejercicio3;

import Ejercicios.ejercicio3.entities.Deportes;
import Ejercicios.ejercicio3.entities.Futbol;
import Ejercicios.ejercicio3.entities.Voleibol;

public class main {
    public static void main(String[] args) {
        Deportes[] deportes = {
                new Futbol("Futbol", 11, 90.5),
                new Voleibol("Voleibol", 6, 30.0),
                new Futbol("Futbol-sala", 5, 30.0),
                new Voleibol("Voleibol-Arena", 6, 30.0)
        };
        for (Deportes deportess : deportes) {
            deportess.detalles();
            System.out.println(" ");
        }
    }
}