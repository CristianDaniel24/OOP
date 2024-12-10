package Streams.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jose", "Carlos", "Daniel", "David");

        String namesJoin = names.stream()
                .collect(Collectors.joining(", "));// Unir los nombres en una sola cadena separados por comas

        System.out.println("\nNames joining: " + namesJoin);
    }
}
