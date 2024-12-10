package Streams.Sorted;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Programacion", "Codigo", "Binarios", "Java");

        List<String> wordsInOrder = words.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())) //Ordenar por longitud
                .toList();
        System.out.println("Words sorted by length" + wordsInOrder);
    }
}
