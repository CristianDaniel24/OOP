package stack;

import java.util.Scanner;
import java.util.Stack;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> names = new Stack<>();
        System.out.println("Enter the number to add in the stack");
        int cant = scanner.nextInt();
        namesImprimir(names, cant, scanner);

    }

    public static void namesImprimir(Stack<String> names, int cant, Scanner scanner) {
        scanner.nextLine();
        for (int i = 0; i < cant; i++) {
            System.out.println("Enter the name:");
            String name = scanner.nextLine();
            names.push(name);
        }
        System.out.println("\nThe names enter is:");
        for (String namess : names) {
            System.out.println("- " + namess);
        }

        System.out.println("\nThe name last is:");
        System.out.println(names.peek());

    }
}
