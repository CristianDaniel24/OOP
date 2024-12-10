package Streams.Filter;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
        CON EL USO DEL ARRAYS.ASLIST SE CONVIERTE UN ARRAY DE ELEMENTOS NORMAL A UNA LISTA
        Y ASI CREAR LISTAS DE UNA FORMA MAS RAPIDA
        */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .limit(2)
                .forEach(System.out::println);
    }
}
