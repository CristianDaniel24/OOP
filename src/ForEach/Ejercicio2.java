package ForEach;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> decimales = new ArrayList<>();

        System.out.println("Enter the size of the decimals");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number:");
            Double number = scanner.nextDouble();
            decimales.add(number);
        }
        System.out.println("\nThe numbers are:");
        for (Double numbers : decimales) {
            System.out.println("-" + numbers);
        }
    }
}
