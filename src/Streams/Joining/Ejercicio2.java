package Streams.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Arrays", "Collector", "Integer");
        String result = words.stream()
                .collect(Collectors.joining(" | ", "[", "]"));// Unir las palabras en una cadena, con un prefijo y un sufijo

        System.out.println("The result is: " + result);
    }
}
