package HashSet;

import java.util.HashSet;

public class HasSetRepaso {
    public static void main(String[] args) {
        // Crear un HashSet de cadenas (Strings)
        HashSet<String> conjunto = new HashSet<>();

        // Añadir elementos al HashSet
        conjunto.add("john tom");
        conjunto.add("john mary");
        conjunto.add("john tom");  // Este duplicado no se añadirá

        // Imprimir el tamaño del HashSet
        System.out.println("Tamaño del conjunto: " + conjunto.size());

        // Imprimir todos los elementos del HashSet

        for (String par : conjunto) {
            System.out.println(par);
        }
    }
}
