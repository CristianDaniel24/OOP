package Streams.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Se agrupan los numeros segun si son pares o impares
        Map<String, List<Integer>> groupedByParity = numbers.stream()
                .collect(Collectors.groupingBy(number -> number % 2 == 0 ? "Even" : "Odd"));

        groupedByParity.forEach((key, value) ->
                System.out.println(key + " numbers: " + value));
    }
}
