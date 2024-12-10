package LocalDateTime.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nEnter the option:");
                System.out.println("1. Print date in different format");
                System.out.println("2. Exit");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        try {
                            System.out.println("\nEnter the Date (AAAA-MM-DD):");
                            String dateInput = reader.readLine();

                            LocalDate date = LocalDate.parse(dateInput);

                            DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                            DateTimeFormatter format3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    
                            System.out.println("\nFormat 1 (DD/MM/AAAA): " + date.format(format1));
                            System.out.println("Format 2 (MMMM d, AAAA): " + date.format(format2));
                            System.out.println("Format 3 (E, MMM dd aaaa): " + date.format(format3));
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
                System.out.println("\nEnter the number, please");
            }
        }
    }
}
