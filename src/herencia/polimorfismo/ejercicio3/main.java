package herencia.polimorfismo.ejercicio3;
import herencia.polimorfismo.ejercicio3.entities.Camisa;
import herencia.polimorfismo.ejercicio3.entities.Camisa1;
import herencia.polimorfismo.ejercicio3.entities.Camisa2;

public class main {
    public static void main(String[] args) {

        Camisa camisas[] = new Camisa[3];

        camisas[0] = new Camisa("Algodon","Charles Tyrwhitt","Toptex");
        camisas[1] = new Camisa1("Seda","Charles Tyrwhitt","Toptex","Negro",
                "Clasico",50000.0);
        camisas[2] = new Camisa2("Algodon","Charles Tyrwhitt","Toptex","Blanco",
                "Anime",60000.0);

        for (Camisa camisass : camisas){
            System.out.println(camisass.detallesCamisa());
            System.out.println(" ");
        }
    }
}
