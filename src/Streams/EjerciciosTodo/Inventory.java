package Streams.EjerciciosTodo;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static void main(String[] args) {

        List<Product> inventary = new ArrayList<>();

        //Se verifica si el inventario esta vacio
        if (inventary.isEmpty()) {
            System.out.println("\nThe inventory is empty =(");
        } else
            System.out.println("\nProcessing product");

        System.out.println("Loading..");
        inventary.add(new Product("Phone", 5));
        inventary.add(new Product("Mac", 4));
        inventary.add(new Product("Tablet", 3));

        //Optional<Product> firstProduct = inventary.stream().findFirst();  Con el metodo findFirst() se puede conseguir el primer elemento
        //Se verifica nuevamente si el inventario esta vacio
        if (inventary.isEmpty()) {
            System.out.println("\nThe inventory is empty =(");
        } else {
            System.out.println("\nThe products are:");
            inventary.forEach(product ->
                    System.out.println("Product: " + product.getName() + "\nQuantity: " + product.getQuantity())
            );
        }
    }
}
