package Streams.Distinct;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "Streams", "ForEach", "streams", "Java");

        List<String> newWords = words.stream()
                .map(String::toLowerCase) //Se convierte a minusculas para comparar sin importar las mayusculas
                .distinct()
                .toList();
        System.out.println(newWords);
    }
}
