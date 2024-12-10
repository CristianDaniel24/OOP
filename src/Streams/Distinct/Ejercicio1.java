package Streams.Distinct;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 5, 4, 1, 3, 5, 6);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct() //Elimina duplicados
                .toList();

        System.out.println(distinctNumbers);
    }
}
