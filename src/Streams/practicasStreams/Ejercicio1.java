package Streams.practicasStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Usa Streams para sumar todos los numeros de la lista
        List<Integer> numbers = Arrays.asList(2, 5);

        Long sum = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.printf("Sum: %d", sum);
    }
}
