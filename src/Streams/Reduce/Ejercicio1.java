package Streams.Reduce;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Se usa reduce para sumar todos los numeros
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("The sum is: " + sum);
    }
}
