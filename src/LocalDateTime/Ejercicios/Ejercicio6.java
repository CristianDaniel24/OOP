package LocalDateTime.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nEnter the option:");
                System.out.println("1. Enter the date");
                System.out.println("2. Exit");
                int option = Integer.parseInt(reader.readLine());

                if (option == 1) {
                    System.out.println("Enter the date (AAAA-MM-DD):");
                    String dateInput = reader.readLine();
                    LocalDate date = LocalDate.parse(dateInput);
                    System.out.println("\nThe date is: " + date);
                } else if (option == 2) {
                    System.out.println("Bye..");
                    exit = true;
                } else {
                    System.out.println("\nThe option is invalid");
                }
            } catch (DateTimeParseException e) {
                System.out.println("\nEnter a date correct");
            }
        }
    }
}