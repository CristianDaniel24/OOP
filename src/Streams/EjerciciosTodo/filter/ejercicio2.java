package Streams.EjerciciosTodo.filter;

import java.util.Arrays;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat", "pig", "snake", "elephant");

        // Filtrar palabras que contienen "cat"
        List<String> palabrasConCat = words.stream()
                .filter(word -> word.contains("pig"))
                .toList();

        System.out.println("\nWords that contain 'pig': " + palabrasConCat);
    }
}
