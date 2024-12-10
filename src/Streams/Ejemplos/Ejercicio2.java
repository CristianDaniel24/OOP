package Streams.Ejemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("luca", "joaquin", "pedro");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)  // Convierte a mayusculas
                .peek(name -> {
                    System.out.println("Name: " + name);
                })
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        List<String> lowerCase = upperCaseNames.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("\n" + lowerCase);
    }
}
