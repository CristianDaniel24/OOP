package Streams.ToSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "java", "example", "stream");

        Set<String> Capitalwords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println("\nWords in capital letters " + Capitalwords);
    }
}
