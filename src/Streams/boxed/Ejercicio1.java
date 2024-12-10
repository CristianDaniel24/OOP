package Streams.boxed;

import java.util.List;
import java.util.stream.IntStream;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 6)
                .map(n -> n * n)
                .boxed() // Convertir a un Stream<Integer>
                .toList();

        System.out.println("The result is:");
        numbers.forEach(num -> System.out.printf("Num: %d%n", num));
    }
}
