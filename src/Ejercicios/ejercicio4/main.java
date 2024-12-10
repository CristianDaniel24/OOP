package Ejercicios.ejercicio4;

import Ejercicios.ejercicio4.entities.Mesa;
import Ejercicios.ejercicio4.entities.MueblesHogar;
import Ejercicios.ejercicio4.entities.Silla;
import Ejercicios.ejercicio4.entities.Sofa;

public class main {
    public static void main(String[] args){

        MueblesHogar[] mueblesHogar = {
                new Sofa("Sofa","Moderno","Gris",6,600000.0),
                new Silla("Silla","Madera","Marron",4,50000.0),
                new Mesa("Mesa","Clasico","Cafe",4,400000.0)
        };
        for (MueblesHogar mueblesHogar1 : mueblesHogar){
            mueblesHogar1.detalles();
            mueblesHogar1.funcion();
            System.out.println(" ");
        }
    }
}
