package TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[5];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("\nThe numbers in the array are");
        for (int numbers : number) {
            System.out.println(numbers);
        }


        try {
            System.out.println("\nEnter the index to Array:");
            int index = Integer.parseInt(reader.readLine());
            System.out.println(number[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nIndex out of bounds. Please enter a valid index");
        }
    }
}
