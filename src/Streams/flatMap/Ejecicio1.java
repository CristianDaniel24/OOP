package Streams.flatMap;

import java.util.Arrays;
import java.util.List;

public class Ejecicio1 {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flatList = numbers.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("The flatList is:");
        flatList.forEach(num -> System.out.println("Num: " + num));
    }
}
