package objetosJava;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<Car> ListCar = new LinkedList<>();

        ListCar.add(new Car("Cacharrito", "Audi", "Blanco"));
        ListCar.add(new Car("La bestia", "Bmw", "Negro"));

        ListCar.forEach(c ->
                System.out.println("\nName: " + c.getName() + "\nBrand: " + c.getMarca() + "\nColor: " + c.getColor())
        );
    }
}
