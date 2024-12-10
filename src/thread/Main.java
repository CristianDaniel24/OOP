package thread;

import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        //Excluye el ultimo digito del rango
        LongStream.range(1, 5).forEach(System.out::println);
        System.out.println();
        //No excluye nada
        LongStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}
