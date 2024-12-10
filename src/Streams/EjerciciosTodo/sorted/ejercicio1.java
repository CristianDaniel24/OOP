package Streams.EjerciciosTodo.sorted;

import java.util.Arrays;
import java.util.List;

public class ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 4, 7, 2);

        List<Integer> numbersOrder = numbers.stream()
                .sorted() //Ordena en orden ascendente
                .toList();

        System.out.println("The numbers in order are: " + numbersOrder);
    }
}
