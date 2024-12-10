package Streams.EjerciciosTodo.limit;

import java.util.Arrays;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Smartphone", 900.0, false),
                new Product("Tablet", 600.0, true),
                new Product("Laptop", 4000.0, true),
                new Product("Monitor", 600.0, true),
                new Product("Mouse", 90.0, true)
        );

        products.stream()
                .filter(Product::isAvailable) // Filtrar productos disponibles
                .limit(3)
                .forEach(p -> System.out.println(p.getName()));
    }

    public static class Product {
        private String name;
        private double price;
        private boolean available;

        public Product(String name, double price, boolean available) {
            this.name = name;
            this.price = price;
            this.available = available;
        }

        public String getName() {
            return name;
        }

        public boolean isAvailable() {
            return available;
        }
    }
}
