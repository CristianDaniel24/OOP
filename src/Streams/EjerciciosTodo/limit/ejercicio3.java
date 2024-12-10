package Streams.EjerciciosTodo.limit;

import java.util.Arrays;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Carlos", "Eduardo", "David", "Beatriz");

        names.stream()
                .sorted() //Ordena alfabeticamente
                .limit(3)
                .forEach(System.out::println);
    }
}
