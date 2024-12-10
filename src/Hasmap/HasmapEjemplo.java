package Hasmap;

import java.util.HashMap;

public class HasmapEjemplo {
    public static void main(String[] args) {
        // Asi se Crea un HashMap
        HashMap<String, Integer> mapPeers = new HashMap<>();

        // Agregar al HasMap pares clave-valor
        mapPeers.put("One", 1);
        mapPeers.put("Two", 2);
        mapPeers.put("Three", 3);

        // Eliminar al HasMap un par clave-valor
        mapPeers.remove("One");

        // Buscar un valor dependiendo de su clave
        System.out.println("\nSearch for a value depending on its key:");
        int value = mapPeers.get("Three");
        System.out.println(value);

        //Iterar el HasMap en un ciclo For each
        System.out.println("\nFOR EACH");
        for (Integer numbers : mapPeers.values()) {
            System.out.println("Valor: " + numbers);
        }

        // Recorrer el HashMap
        for (String key : mapPeers.keySet()) {
            System.out.println("Clave: " + key + ", Valor: " + mapPeers.get(key));
        }

        //HasMap size
        System.out.println("\nHasMap size");
        System.out.println(mapPeers.size());
    }
}