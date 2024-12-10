package herencia.ejercicio1;

import herencia.ejercicio1.entities.Bicicleta;
import herencia.ejercicio1.entities.Coche;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche(2005,"bmw", 4);
        coche1.detallesPersonalizado();

        Bicicleta bicicleta1 = new Bicicleta(2010, "Specialized",false);
        bicicleta1.detallesPersonalizado();

        //bicicleta1.detalles();
        //coche1.detalles();
    }
}