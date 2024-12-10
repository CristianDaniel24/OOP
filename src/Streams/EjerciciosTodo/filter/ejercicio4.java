package Streams.EjerciciosTodo.filter;

import java.util.Arrays;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Cat", "Dog", "Elephant", "Giraffe");

        List<String> wordsLarge = words.stream()
                .filter(word -> word.length() > 5)
                .toList();

        System.out.println("\nWords with more than 5 characters: " + wordsLarge);
    }
}
