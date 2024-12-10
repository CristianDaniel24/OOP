package linketList;

import java.util.LinkedList;

public class Ejercicio2 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.size();

        System.out.println("Result of the Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
