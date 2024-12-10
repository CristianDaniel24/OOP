package Streams.EjerciciosNotion;

import java.util.Arrays;
import java.util.List;

public class Parte1Ejercicio1 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alejandra", "Carlos", "Javier", "Alfonso", "Javier", "Carlos");

        //Eliminar duplicados
        List<String> namesDuplicates = names.stream()
                .distinct()
                .sorted()
                .filter(name -> name.startsWith("A"))
                .toList();

        //Contar los nombres que empiezen por la A
        int count = namesDuplicates.size();

        System.out.println("\nThe names are:");
        namesDuplicates.forEach(System.out::println);
        System.out.println("Names by A: " + count);
    }
}
