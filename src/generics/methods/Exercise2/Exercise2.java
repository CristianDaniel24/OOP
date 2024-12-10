package generics.methods.Exercise2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> stringList = List.of("b", "e", "d", "a", "z");
        System.out.println(findMinimum(stringList));

        List<Integer> integerList = List.of(7, 4, 7, 3, 8, 9, 1);
        System.out.println(findMinimum(integerList));

        List<Double> doubleList = List.of(7.2, 4.1, 7.5, 3.6, 8.8, 9.2, 1.5);
        System.out.println(findMinimum(doubleList));

    }

    public static <T extends Comparable<T>> T findMinimum(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }
        return Collections.min(list, Comparator.naturalOrder());
    }
}
