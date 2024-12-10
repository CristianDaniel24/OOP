package Streams.Count;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        //Se usa count() para contar los numeros mayores a 30
        long count = numbers.stream()
                .filter(n -> n > 30)
                .count();

        System.out.println("\nNumber of numbers greater than 30: " + count);

    }
}
