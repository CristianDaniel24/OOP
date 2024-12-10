package Practice;

import java.util.ArrayList;
import java.util.List;

public class updateList {
    public static void main(String[] args) {
        // Crear una lista de productos
        List<ProductUpdate> productos = new ArrayList<>();
        productos.add(new ProductUpdate(1, "Laptop", 1000.0)); // Posición 0
        productos.add(new ProductUpdate(2, "Teléfono", 500.0)); // Posición 1
        productos.add(new ProductUpdate(3, "Tablet", 300.0)); // Posición 2
        productos.add(new ProductUpdate(4, "Monitor", 150.0)); // Posición 3

        // Mostrar la lista original
        System.out.println("Lista original:");
        productos.forEach(System.out::println);

        // Actualizar el precio del producto en la posicion 2
        ProductUpdate productoEnPosicion2 = productos.get(2);
        productoEnPosicion2.setPrecio(350.0);  // Cambiar el precio de la tablet

        // Mostrar la lista actualizada
        System.out.println("\nLista actualizada:");
        productos.forEach(System.out::println);
    }
}
