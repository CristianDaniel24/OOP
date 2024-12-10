package Streams.EjerciciosNotion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Parte2Ejercicio1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        Map<Boolean, List<Integer>> partitionedNumbers = primeNum(numbers);

        System.out.println("\nThe numbers primes are: " + partitionedNumbers.get(true));
        System.out.println("\nThe numbers not primes are: " + partitionedNumbers.get(false));
    }

    public static Map<Boolean, List<Integer>> primeNum(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.partitioningBy(Parte2Ejercicio1::isPrime));//Como el metodo isPrime() es estatico, es necesario usar el nombre de la clase para referenciarlo
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
