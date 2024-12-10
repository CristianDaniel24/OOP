package Streams.ToList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<Persona> persons = Arrays.asList(
                new Persona("Bob", 32),
                new Persona("Carlos", 12),
                new Persona("Lucas", 18)
        );

        List<String> names = persons.stream()
                .map(Persona::getNombre)
                .collect(Collectors.toList());
        System.out.println("The names are: " + names);
    }
}
