package Streams.boxed;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ejercicio2 {
    public static void main(String[] args) {
        Map<Long, Long> cubos = LongStream.rangeClosed(1, 5)
                .boxed() // Convertir a Stream<Long>
                .collect(Collectors.toMap(
                        n -> n, //Clave: numero original
                        n -> n * n * n //Valor: cubo del numero
                ));

        System.out.println("The result is:");
        cubos.entrySet().forEach(entry -> System.out.printf("Num: %d  Cube: %d%n", entry.getKey(), entry.getValue()));
    }
}
