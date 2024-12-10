package herencia.polimorfismo.ejercicio1;

import herencia.polimorfismo.ejercicio1.entities.Pastel;
import herencia.polimorfismo.ejercicio1.entities.preparacion1;
import herencia.polimorfismo.ejercicio1.entities.preparacion2;

public class main {
    public static void main(String[] args) {

        Pastel pasteles[] = new Pastel[3];

        pasteles[0] = new Pastel("1 Kilo",1.5,5);
        pasteles[1] = new preparacion1("1 Kilo",1.5,5,"Fresas");
        pasteles[2] = new preparacion2("1 Kilo",1.5,5,3);

        for (Pastel preparaciones : pasteles){
            System.out.println(preparaciones.detallesPastel());
            System.out.println(" ");//Con este print se logra que entre cada iteracion se agregue un espacio
        }
    }
}
