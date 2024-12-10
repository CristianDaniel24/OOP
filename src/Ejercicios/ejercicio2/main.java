package Ejercicios.ejercicio2;

import Ejercicios.ejercicio2.entities.Galaxia;
import Ejercicios.ejercicio2.entities.Planeta;

public class main {
    public static void main(String[] args){
        Planeta planeta = new Planeta();
        planeta.movimiento();

        Galaxia galaxia = new Galaxia();
        galaxia.movimiento();
    }
}
