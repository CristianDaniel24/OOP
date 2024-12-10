package LocalDateTime.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nEnter the option:");
                System.out.println("1. Calculate the time difference between 2 dates");
                System.out.println("2. Exit");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        try {
                            System.out.println("Enter the date 1 (AAAA-MM-DD):");
                            String date1 = reader.readLine();
                            LocalDate localDate1 = LocalDate.parse(date1);

                            System.out.println("Enter the date 2 (AAAA-MM-DD):");
                            String date2 = reader.readLine();
                            LocalDate localDate2 = LocalDate.parse(date2);

                            Period difference = Period.between(localDate1, localDate2);

                            System.out.println("\nThe difference between the dates is:");
                            System.out.println(difference.getYears() + " years");
                            System.out.println(difference.getMonths() + " months");
                            System.out.println(difference.getDays() + " days");
                        } catch (DateTimeParseException e) {
                            System.out.println("\nEnter a correct date format (AAAA-MM-DD)");
                        }
                        break;
                    case 2:
                        System.out.println("Bye..");
                        exit = true;
                        break;
                    default:
                        System.out.println("\nThe option is invalid");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEnter the number please");
            }
        }
    }
}
