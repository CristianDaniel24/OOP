package herencia.polimorfismo.ejercicio5;

import herencia.polimorfismo.ejercicio5.entities.Bateria;
import herencia.polimorfismo.ejercicio5.entities.Guitarra;
import herencia.polimorfismo.ejercicio5.entities.InstrumentosMusicales;
import herencia.polimorfismo.ejercicio5.entities.Piano;

public class main {
    public static void main(String[] args) {

        InstrumentosMusicales instrumentosMusicales = new InstrumentosMusicales("Neutro","Yamaha",200000.0);

            System.out.println(instrumentosMusicales.detallesInstrumentos());
            System.out.println(" ");
            System.out.println("GUITARRA🎸");
            Guitarra guitarra = new Guitarra("Neutro","Casio",1000000.0,"Años 90",2,"Neutro");
                System.out.println(guitarra.detallesInstrumentos());
                System.out.println(" ");
                System.out.println(guitarra.add("Rojo","Casio",2000000.0,"Años 80",2,"Fuego"));
                System.out.println(" ");
                System.out.println(guitarra.add("Negro","Yamaha",3000000.0,"Clasico",1));
                System.out.println(" ");
                System.out.println("BATERIA🥁");
            Bateria bateria = new Bateria("Neutro","Yamaha",100000.0,"Clasico",2,"Clasico");
                System.out.println(bateria.detallesInstrumentos());
                System.out.println(" ");
                System.out.println(bateria.add("Negro con Rojo","Yamaha",2000000.0,"Clasico",2,"Twenty One Pilots"));
                System.out.println(" ");
                System.out.println(bateria.add("Azul con Blanco","Casio",2000000.0,"2005",2));
                System.out.println(" ");
                System.out.println("PIANO🎹");
            Piano piano = new Piano("Neutro","Casio",200000.0,"2020",1,"Neutro");
                System.out.println(piano.detallesInstrumentos());
                System.out.println(" ");
                System.out.println(piano.add("Rojo","Casio",500000.0,"2020",1,"Anime"));
                System.out.println(" ");
                System.out.println(piano.add("Clasico","Yamaha",300000.0,"2021",2));
        }
    }