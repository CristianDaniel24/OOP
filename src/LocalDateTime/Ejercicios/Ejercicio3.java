package LocalDateTime.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nEnter the option");
                System.out.println("1. Print my next birthdays");
                System.out.println("2. Exit");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        try {
                            System.out.println("Enter your date of birth (AAAA-MM-DD):");
                            String birthDate = reader.readLine();

                            LocalDate dateBirth = LocalDate.parse(birthDate);
                            LocalDate localDateNow = LocalDate.now();

                            // Calcular la fecha del proximo cumpleaños
                            LocalDate nextBirth = dateBirth.withYear(localDateNow.getYear());
                            // Si el proximo cumpleaños ya ocurrio este año, se ajusta al proximo año
                            if (nextBirth.isBefore(localDateNow) || nextBirth.isEqual(localDateNow)) {
                                nextBirth = nextBirth.plusYears(1);
                            }
                            Long days = ChronoUnit.DAYS.between(localDateNow, nextBirth);
                            System.out.println(days);
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
