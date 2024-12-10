package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        //Con el metodo String::valueOf se puede convertir cualquier tipo de dato a cadena de texto
        List<String> textToNumbers = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(textToNumbers);
    }
}
