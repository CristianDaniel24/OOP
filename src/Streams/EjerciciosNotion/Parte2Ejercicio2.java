package Streams.EjerciciosNotion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Parte2Ejercicio2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Streams", "Are", "Powerful", "Awesome", "Great");
        int minLength = 5;

        Optional<String> wordLongest = words.stream()
                .filter(p1 -> p1.length() >= minLength)//Se filtran las cadenas mayores o iguales a la variable
                .reduce((c1, c2) -> c1.length() > c2.length() ? c1 : c2);//Se consigue la cadena mas larga

        wordLongest.ifPresentOrElse(
                p -> System.out.println("\nLongest String: " + p),
                () -> System.out.println("\nThere are no words longer than 5 characters =(")
        );
    }
}
