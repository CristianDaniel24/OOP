package ForEach;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();
        String[] person = new String[size];

        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name of Person:");
            person[i] = scanner.nextLine();
        }
        System.out.println("The persons are:");
        for (String persons : person) {
            System.out.println("Name: " + persons);
        }
    }
}
