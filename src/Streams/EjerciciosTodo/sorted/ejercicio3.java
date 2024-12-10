package Streams.EjerciciosTodo.sorted;

import java.util.Arrays;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Dog", "Cat", "Elephant", "Mouse");

        // Ordenar por longitud
        List<String> wordsInOrder = words.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();

        System.out.println("Words sorted by length: " + wordsInOrder);
    }
}
