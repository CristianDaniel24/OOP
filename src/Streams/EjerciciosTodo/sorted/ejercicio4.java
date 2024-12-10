package Streams.EjerciciosTodo.sorted;

import java.util.Arrays;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 8, 1, 7, 2);

        // Ordenar de mayor a menor
        List<Integer> numbersOrderDesc = numbers.stream()
                .sorted((n1, n2) -> Integer.compare(n2, n1))
                .toList();

        System.out.println("Numbers ordered from greatest to least: " + numbersOrderDesc);
    }
}
