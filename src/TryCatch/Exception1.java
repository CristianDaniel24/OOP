package TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int reult = 0;
        try {
            System.out.println("Enter the number 1");
            int number1 = Integer.parseInt(reader.readLine());
            System.out.println("Enter the number 2");
            int number2 = Integer.parseInt(reader.readLine());
            reult = number1 / number2;
            System.out.println("The result is: " + reult);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (NumberFormatException e) {
            System.out.println("Enter the number Please!!");
        }
    }
}
