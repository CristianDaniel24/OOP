package LocalDateTime.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nEnter the option");
                System.out.println("1. Enter the date for sum or rest");
                System.out.println("2. Exit");
                int option = Integer.parseInt(reader.readLine());
                if (option == 1) {
                    System.out.println("\nEnter the date (AAAA-MM-DD):");
                    String dateInput = reader.readLine();
                    LocalDate date = LocalDate.parse(dateInput);

                    System.out.println("\n Enter the unit of time to add or subtract (days, weeks, months, years)");
                    String unitTime = reader.readLine().toLowerCase();

                    System.out.println("\nDo you want to add or subtract?");
                    String operation = reader.readLine();

                    System.out.println("\nEnter the amount of " + unitTime + " for " + operation + " :");
                    int amount = Integer.parseInt(reader.readLine());
                    LocalDate dateModify = null;

                    switch (unitTime) {
                        case "days":
                            dateModify = operation.equals("add") ?
                                    date.plusDays(amount) :
                                    date.minusDays(amount);
                            break;
                        case "weeks":
                            dateModify = operation.equals("add") ?
                                    date.plusWeeks(amount) :
                                    date.minusWeeks(amount);
                            break;
                        case "months":
                            dateModify = operation.equals("add") ?
                                    date.plusMonths(amount) :
                                    date.minusMonths(amount);
                            break;
                        case "years":
                            dateModify = operation.equals("add") ?
                                    date.plusYears(amount) :
                                    date.minusYears(amount);
                            break;
                        default:
                            System.out.println("\nThe option is invalid");
                    }
                    System.out.println("\nThe end date is: " + dateModify);
                } else if (option == 2) {
                    System.out.println("Bye..");
                    exit = true;
                } else {
                    System.out.println("\nThe option is invalid");
                }
            } catch (DateTimeParseException e) {
                System.out.println("\nEnter a date correct");
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please");
            }
        }
    }
}