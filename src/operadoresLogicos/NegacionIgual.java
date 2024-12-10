package operadoresLogicos;

import java.util.Scanner;

public class NegacionIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int numero = scanner.nextInt();

        if (numero != 20) {
            System.out.println("The number is not equal 20");
        } else {
            System.out.println("The number is equal 20");
        }
    }
}