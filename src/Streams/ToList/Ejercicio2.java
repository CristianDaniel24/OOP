package Streams.ToList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {

        String text = "Juan,Lucas,Pablo,Jose";

        List<Person> personList = Arrays.stream(text.split(","))
                .map(Person::new)
                .collect(Collectors.toList());

        System.out.println("List of Persons: " + personList);
    }
}
