package Streams.EjerciciosNotion;

import java.util.Arrays;
import java.util.List;

public class Parte1Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 12, 4, 6, 8, 15);

        //Numero mayor
        int numberElderly = numbers.stream()
                .reduce((n1, n2) -> n1 > n2 ? n1 : n2)
                .orElse(0);

        //Contar numero pares
        Long numbersEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("\nLargest number: " + numberElderly);
        System.out.println("Even numbers: " + numbersEven);
    }
}
