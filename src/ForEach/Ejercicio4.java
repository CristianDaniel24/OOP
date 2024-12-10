package ForEach;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> pets = new LinkedList<>();

        System.out.println("Enter the size of pets");
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name of the pets:");
            String name = scanner.nextLine();
            pets.add(name);
        }
        System.out.println("\nThe pets are:");
        for (String petsPrint : pets) {
            System.out.println("-" + petsPrint);
        }
    }
}
