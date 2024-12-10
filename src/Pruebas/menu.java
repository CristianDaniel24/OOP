package Pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menu {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nLOGIN");
                System.out.println("1. Create account");
                System.out.println("2. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        Validaciones validaciones = new Validaciones();
                        System.out.println("\nEnter your name:");
                        String nameInput = reader.readLine();
                        validaciones.validateName(nameInput);

                        System.out.println("Enter your phone:");
                        String phoneInput = reader.readLine();
                        validaciones.validatePhone(phoneInput);

                        System.out.println("Enter your document:");
                        String documentInput = reader.readLine();
                        validaciones.validateDocument(documentInput);

                        System.out.println("Enter your mail:");
                        String mailInput = reader.readLine();
                        validaciones.validateMail(mailInput);

                        System.out.println("Enter your password:");
                        String passwordInput = reader.readLine();
                        validaciones.validatePassword(passwordInput);
                        break;
                    case 2:
                        exit = true;
                        break;
                    default:
                        System.out.println("The option is invalid");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please");
            } catch (IOException | ExceptionValidateAccount e) {
                throw new RuntimeException(e);
            }
        }
    }
}
