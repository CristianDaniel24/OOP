package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lucas", "Daniel", "Carlos");

        List<Integer> longNames = names.stream()
                .map(String::length)//Se referencian las palabras y se saca la longitud de ellas
                .collect(Collectors.toList());
        System.out.println(longNames);
    }
}
