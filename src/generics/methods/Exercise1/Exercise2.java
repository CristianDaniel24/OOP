package generics.methods.Exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu");
            System.out.println("1. Print list String");
            System.out.println("2. Print list Integer");
            System.out.println("3. Print list Double");
            System.out.println("4. Exit");
            System.out.println("Enter the option:");
            int option = Integer.parseInt(reader.readLine());
            switch (option) {
                case 1:
                    List<String> stringList = List.of("Welcome", "to", "Java", "2.0");
                    printList(stringList);
                    break;
                case 2:
                    List<Integer> integerList = List.of(5, 4, 3, 2, 1);
                    printList(integerList);
                    break;
                case 3:
                    List<Double> doubleList = List.of(7.4, 8.2, 2.4);
                    printList(doubleList);
                    break;
                case 4:
                    System.out.println("Exit..");
                    exit = true;
                    break;
                default:
                    System.out.println("Enter the option correct");
            }
        }
    }

    public static <T> void printList(List<T> list) {
        System.out.println();
        list.forEach(System.out::println);
    }
}
