package PracticasInstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Map<String, Object>> listaDiccionario = new ArrayList<>();

        listaDiccionario.add(Map.of("Nombre", "Jose", "Edad", 35));
        listaDiccionario.add(Map.of("Nombre", "Alfonso", "Edad", 24));
        listaDiccionario.add(Map.of("Nombre", "Pedro", "Edad", 18));

        listaDiccionario.sort(Comparator.comparing(map -> (Integer) map.get("Edad")));

        for (Map<String, Object> item : listaDiccionario) {
            System.out.println(item);
        }
    }
}
