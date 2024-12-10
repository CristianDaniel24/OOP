package Streams.ToSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 4, 7, 8, 5);

        Set<Integer> numbersUnique = numeros.stream()
                .collect(Collectors.toSet());//Envia los datos al set y asi se pueden enviar sin duplicados

        System.out.println("Numbers unique: " + numbersUnique);
    }
}
