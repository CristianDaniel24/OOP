package Streams.Filter;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jose");
        names.add("Laura");
        names.add("Mario");
        names.add("Luca");

        names.stream()
                .filter(name -> name.startsWith("L"))
                .forEach(System.out::println);
    }
}
