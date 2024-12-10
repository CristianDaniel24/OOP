package Streams.EjerciciosNotion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parte1Ejercicio3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Streams", "Are", "Awesome");

        //Se unen las palabras de la lista en unico String
        int totalWords = words.stream()
                .collect(Collectors.joining(" "))
                .replace(" ", "")
                .length();

        System.out.println(totalWords);
    }
}
