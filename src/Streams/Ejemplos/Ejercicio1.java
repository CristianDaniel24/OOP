package Streams.Ejemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> num = List.of(1, 2, 3, 4, 5, 6);

        /*
        El map() no altera los elementos originales sino que crea un nuevo Stream con los resultados de la transformacion
        map() es util cuando se necesita modificar cada elemento en un Stream de acuerdo a una operacion especifica
         */
        List<Integer> newNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(newNumbers);
    }
}
