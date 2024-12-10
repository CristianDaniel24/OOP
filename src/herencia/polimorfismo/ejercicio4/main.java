package herencia.polimorfismo.ejercicio4;

import herencia.polimorfismo.ejercicio4.entities.Camisa;
import herencia.polimorfismo.ejercicio4.entities.Pantalon;
import herencia.polimorfismo.ejercicio4.entities.PrendasDeVestir;
import herencia.polimorfismo.ejercicio4.entities.Zapatos;

public class main {
    public static void main(String[] args) {
        PrendasDeVestir prendasDeVestir= new PrendasDeVestir("Rojo","Algodon","Adidas");
        System.out.println(prendasDeVestir.detallesPrendas());
        System.out.println(" ");
        //CAMISA
        Camisa camisa = new Camisa("Azul","Algodon","Adidas","Anime","Si",40000.0);
        System.out.println("CAMISAS👕");
        System.out.println(camisa.add());
        System.out.println(" ");
        System.out.println(camisa.add("Negro","Algodon","Nike","Equipo de Futbol","Si",60000.0));
        System.out.println(" ");
        //PANTALON
        Pantalon pantalon = new Pantalon("Azul","Lana","Levi´s","Vaquero","Calcas de Fuego",80000.0);
        System.out.println("PANTALONES👖");
        System.out.println(pantalon.add("Negro","Lana","Adidas","Clasico","Logos",80000.0));
        System.out.println(" ");
        System.out.println(pantalon.add("Azul Oscuro","Lana","Levi´s","Vaquero",70000.0));
        System.out.println(" ");
        //ZAPATOS
        Zapatos zapatos = new Zapatos("Azul","Cuero","Adidas","Si","Deportivo",120000.0);
        System.out.println("ZAPATOS👟");
        System.out.println(zapatos.add("Marron","Cuero","Santorini","Botas",150000.0));
        System.out.println(" ");
        System.out.println(zapatos.add("Blancos","Caucho","Adidas","Calcas de Colores","Deportivo",140000.0));
    }
}