package Streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> frase = Arrays.asList(
                "hola mundo java",
                "mundo de stremas con flatMap",
                "en java"
        );

        List<String> wordsJoin = frase.stream()
                .map(frases -> frases.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(wordsJoin);
    }
}
