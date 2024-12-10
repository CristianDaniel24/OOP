package LocalDateTime.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nEnter the option:");
                System.out.println("1. Print my current years");
                System.out.println("2. Exit");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        try {
                            System.out.println("Enter your date of birth (AAAA-MM-DD):");
                            String dateBirth = reader.readLine();
                        
                            // Convertir la cadena de texto en un objeto LocalDate
                            LocalDate birthDate = LocalDate.parse(dateBirth);

                            LocalDate dateNow = LocalDate.now();
                            // Calcular la edad utilizando la clase Period
                            Period age = Period.between(birthDate, dateNow);

                            System.out.println("\nHave " + age.getYears() + " years");
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