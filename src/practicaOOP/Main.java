package practicaOOP;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new LinkedList<>();

        vehiculos.add(new Coche("Toyota", "Clasico", 2021, 4));
        vehiculos.add(new Camion("Volvo", "Moderno", 2019, 18.5));
        vehiculos.add(new Coche("Ford", "Clasico", 2018, 3));

        vehiculos.forEach(System.out::println);
    }
}
