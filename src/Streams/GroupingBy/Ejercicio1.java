package Streams.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Smartphone", "Electronics", 800.0),
                new Product("Shirt", "Clothing", 25.0),
                new Product("Jeans", "Clothing", 50.0),
                new Product("Blender", "Appliances", 100.0)
        );

        Map<String, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        productsByCategory.forEach((category, productList) -> {
            System.out.println("Category: " + category);
            productList.forEach(System.out::println);
        });
    }
}
