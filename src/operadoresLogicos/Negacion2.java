package operadoresLogicos;

import java.util.Scanner;

public class Negacion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int numero = scanner.nextInt();

        if (!(numero < 0)) {
            System.out.println("The number is not negative");
        } else {
            System.out.println("The number is negative");
        }
    }
}
