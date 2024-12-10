package Streams.EjerciciosTodo.limit;

import java.util.Arrays;
import java.util.List;

public class ejercicio1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("sol", "luna", "nube", "relampago", "tormenta", "viento");

        words.stream()
                .filter(p -> p.length() >= 4)
                .limit(2)
                .forEach(System.out::println);
    }
}
