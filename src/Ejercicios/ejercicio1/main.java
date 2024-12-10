package Ejercicios.ejercicio1;

import Ejercicios.ejercicio1.entities.Apartamento;
import Ejercicios.ejercicio1.entities.Vivienda;
import Ejercicios.ejercicio1.entities.casa;

public class main {
    public static void main(String[] args) {

        Vivienda[] viviendas ={
                new casa("Alfonzo",32,"Clasico",80000000000.0),
                new Apartamento("Hernan",40,"Moderno",90000000000.0),
                new casa("Daniela",28,"Moderno",100000000000.0),
                new Apartamento("Juana",34,"Futurista",83000000000.0),
        };

        for (Vivienda vivienda : viviendas){
            vivienda.detalles();
            System.out.println(" ");
        }




    }
}