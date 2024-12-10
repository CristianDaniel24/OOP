package objetosJava;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Creacion de una lista de objetos Producto
        List<Product> listProduct = new ArrayList<>();

        // Agregar objetos Product a la lista
        listProduct.add(new Product("Apple", 3.2, 8));
        listProduct.add(new Product("Orange", 5.1, 3));
        listProduct.add(new Product("Berry", 9.2, 6));

        // Imprimir los objetos de la lista
        listProduct.forEach(p ->
                System.out.println("\nName: " + p.getName() + "\nPrice: " + p.getPrice() + "\nQuantity: " + p.getQuantity())
        );
    }
}
