package Streams.practicasStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Usa Streams para obtener el producto con el precio mas bajo
        List<Product> products = Arrays.asList(
                new Product("Laptop", 899.99),
                new Product("Mouse", 25.00),
                new Product("Teclado", 45.99),
                new Product("Monitor", 150.75)
        );

        Optional<Product> lowCost = products.stream()
                .min(Comparator.comparingDouble(Product::getPrice));
        //Para conseguir el numero maximo:
        //.max(Comparator.comparingDouble(Product::getPrice));

        System.out.printf("\nThe number low is: %f", lowCost.get().getPrice());
    }

    public static class Product {
        private String name;
        private Double price;

        public Product(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }
}
