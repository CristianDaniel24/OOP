package Streams.Reduce;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Se usa reduce para multiplicar todos los numeros
        int result = numbers.stream()
                .reduce(1, (subtotal, element) -> subtotal * element);

        System.out.println("Result: " + result);
    }
}
