package herencia.polimorfismo.ejercicio2;

import herencia.polimorfismo.ejercicio2.entities.Computador;
import herencia.polimorfismo.ejercicio2.entities.Computador1;
import herencia.polimorfismo.ejercicio2.entities.Computador2;

public class main {
    public static void main(String[] args) {

        Computador computadores[] = new Computador[3];

        computadores[0] = new Computador("Asus",2015,1000000.0);
        computadores[1] = new Computador1("Asus-Vivobook",2020,"Blanco",2000000.0);
        computadores[2] = new Computador2("Asus-Vivobook-pro",2022,"Gris",4000000.0);

        for (Computador computadores1 : computadores){
            System.out.println(computadores1.detallesComputador());
            System.out.println(" ");
        }
    }
}
