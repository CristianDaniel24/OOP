package HackerRankPractica;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        int sum = 0;

        for (Integer result : numbers) {
            sum += result;
        }
        System.out.println(sum);
    }
}
