package Streams.Count;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "C++", "C#", "Javier");

        // Usamos count() para contar las palabras que empiezan con la J
        long count = words.stream()
                .filter(word -> word.startsWith("J"))
                .count();

        System.out.println("\nNumber of words starting with 'J' " + count);
    }
}
