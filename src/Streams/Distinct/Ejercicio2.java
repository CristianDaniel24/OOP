package Streams.Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Streams", "ForEach", "Streams", "Java");

        String newWords = words.stream()
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(newWords);
    }
}
