package ForEach;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size to Array:");
        int size = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Numbers:");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("The numbers are:");
        for (Integer numbersPrint : numbers) {
            System.out.println(numbersPrint);
        }
    }
}
