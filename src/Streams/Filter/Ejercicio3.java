package Streams.Filter;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        EL PARALLELSTREAM PERMITE USAR MULTIPLES NUCLEOS DE LA CPU (SOLO SI ESTAN DISPONIBLES)
       - sorted()
         */
        numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
