package generics.methods.Exercise1;

import java.io.IOException;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        List<Integer> linkedList = List.of(1, 2, 3, 4, 5, 6);
        List<Double> doubleList = List.of(2.3, 5.3, 7.6);
        List<String> stringList = List.of("hello", "world");
        printList(linkedList);
        printList(doubleList);
        printList(stringList);
    }

    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }
}
