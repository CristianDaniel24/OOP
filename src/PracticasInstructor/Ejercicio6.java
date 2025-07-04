package PracticasInstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Dividir");
                System.out.println("2. Salir");
                System.out.println("Ingresa una opcion:");
                int option = Integer.parseInt(reader.readLine());

                if (option == 1) {
                    System.out.println("Ingresa el numero 1:");
                    int num1 = Integer.parseInt(reader.readLine());
                    System.out.println("Ingresa el numero 2:");
                    int num2 = Integer.parseInt(reader.readLine());

                    Double result = division(num1, num2);

                    System.out.println("\nEl resultado de la division es: " + result);
                } else if (option == 2) {
                    System.out.println("Saliendo..");
                    exit = true;
                } else {
                    System.out.println("\nIngresaste una opcion incorrecta");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero porfavor");
            } catch (ArithmeticException e) {
                System.out.println("No puedes dividir por cero");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Double division(int num1, int num2) {
        return (double) (num1 / num2);
    }
}
