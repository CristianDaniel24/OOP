package Streams.Count;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "HTML", "CSS", "JavaScript", "SQL", "Python");

        //Se usa count() para contar las palabras las cuales su longitud es mayor a 4
        long count = words.stream()
                .filter(word -> word.length() > 4)
                .count();

        System.out.println("\nNumber of words with more than 4 characters: " + count);
    }
}
