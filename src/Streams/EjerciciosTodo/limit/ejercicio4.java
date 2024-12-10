package Streams.EjerciciosTodo.limit;

import java.util.Arrays;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .map(n -> n * n) //Sacar el cuadrado de cada numero
                .limit(3)
                .forEach(System.out::println);
    }
}
