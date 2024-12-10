package Streams.EjerciciosNotion.todo.ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> productsTxt = Files.readAllLines(Paths.get("src/Streams/EjerciciosNotion/todo/ejercicio1/Products"));

        List<Product> products = productsTxt.stream()
                .map(product -> {
                    String[] data = product.split(", ");
                    return new Product(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]));
                })
                .toList();

        List<Product> products1 = products.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice())) // Ordenar por precio de mayor a menor
                .limit(3) // Limitar a los 3 primeros
                .toList();

        System.out.println("\nThe products are:");
        products1.forEach(System.out::println);
    }
}
