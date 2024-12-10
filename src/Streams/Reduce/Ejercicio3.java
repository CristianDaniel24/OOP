package Streams.Reduce;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "es", "interesante");

        //Se usa reduce para contar el numero de elementos en la lista
        words.stream()
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .stream().forEach(System.out::println);
    }
}
