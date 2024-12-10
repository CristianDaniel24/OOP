package Streams.Sorted;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Audifonos", 500.00),
                new Producto("Celular", 800.00),
                new Producto("Monitor", 200.00)
        );

        List<Producto> productosOrdenados = productos.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio())) // Orden descendente porque se pone primero el p2.getPrecio()
                .toList();

        productosOrdenados.forEach(System.out::println);
    }
}
