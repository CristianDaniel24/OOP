package HashSet;

import java.util.HashSet;

public class HashSetEjemplo {
    public static void main(String[] args) {
        // Asi se crea un HashSet
        HashSet<String> hashset = new HashSet<>();

        // Agregar elementos al HashSet
        hashset.add("Naranja");
        hashset.add("Banana");
        hashset.add("Manzana");
        hashset.add("Naranja"); // No se pueden agregar duplicados

        // Imprimir el HashSet
        System.out.println("Elementos del HashSet: " + hashset);

        // Ver si un elemento existe en el HashSet o no
        if (hashset.contains("Banana")) {
            System.out.println("\nEl HashSet si contiene la Banana");
        } else {
            System.out.println("\nEl HashSet no contiene la Banana");
        }

        // Eliminar un elemento del HashSet
        hashset.remove("Manzana");
        System.out.println("\nElementos despues de eliminar la Manzana: " + hashset);

        // Tamaño del HashSet
        System.out.println("\nTamaño del HashSet: " + hashset.size());
    }
}
