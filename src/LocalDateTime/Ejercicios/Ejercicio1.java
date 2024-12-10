package LocalDateTime.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {

                System.out.println("\nEnter the option:");
                System.out.println("1. Print current date and time");
                System.out.println("2. Exit");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        LocalDateTime fechaActual = LocalDateTime.now();
                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
                        String fechaFormater = fechaActual.format(formato);

                        System.out.println("\nLa fecha actual es: " + fechaFormater);
                        break;
                    case 2:
                        System.out.println("Bye..");
                        exit = true;
                        break;
                    default:
                        System.out.println("\nThe optin is invalid");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please");
            }
        }
    }
}
