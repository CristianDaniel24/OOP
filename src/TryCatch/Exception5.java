package TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the age:");
        int age = Integer.parseInt(reader.readLine());
        try {
            verifyAge(age);
        } catch (ExceptionInvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verifyAge(int age) throws ExceptionInvalidAgeException {
        if (age < 18) {
            throw new ExceptionInvalidAgeException("You are a minor");
        } else {
            System.out.println("You are of legal age");
        }
    }
}
