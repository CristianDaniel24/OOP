package Ejercicios.ejercicio5;

import Ejercicios.ejercicio5.entities.Gato;
import Ejercicios.ejercicio5.entities.Loro;
import Ejercicios.ejercicio5.entities.Mascotas;
import Ejercicios.ejercicio5.entities.Perro;

public class main {
    public static void main(String[] args){

        Mascotas[] mascotas = {
                new Gato("Gato","Algunas veces si y algunas no",
                        "Pescado","Amarillo pastel","Siames"),
                new Perro("Perro","Es muy amigable",
                        "Omnivoro","Negro","pug on"),
                new Loro("Loro","No es muy amigable",
                        "Fruta","Verde","Periquito")
        };
        for (Mascotas mascotas1 : mascotas){
            mascotas1.detalles();
            mascotas1.funcion();
            System.out.println(" ");
        }
    }
}
