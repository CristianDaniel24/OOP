package TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size to array:");
        int size = Integer.parseInt(reader.readLine());

        int[] numbers = new int[size];
        try {
            System.out.println("Enter the number 1:");
            int number1 = Integer.parseInt(reader.readLine());
            System.out.println("Enter the number 2:");
            int number2 = Integer.parseInt(reader.readLine());

            int result = number1 / number2;
            System.out.println("\nThe result of the division is: " + result);

            System.out.println("Enter the index to store it:");
            int index = Integer.parseInt(reader.readLine());
            numbers[index] = result;
            for (int number : numbers) {
                System.out.println(number);
            }
        } catch (ArithmeticException e) {
            System.out.println("\nDivision by zero is not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nIndex out of bounds. Please enter a valid index");
        }
    }
}
