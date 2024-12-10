package TryCatch;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Se intenta dividir por cero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Se maneja la excepcion
            System.out.println("Division by zero is not allowed");
        } finally {
            // El print se va a ejecutar siempre sin importar si hay o no exepciones
            System.out.println("Esto se imprime asi exista una excepcion o no");
        }
    }
}
