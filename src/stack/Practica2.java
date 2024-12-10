package stack;

import java.util.Scanner;
import java.util.Stack;

public class Practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> productos = new Stack<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu to Products:");
            System.out.println("1. Add the product");
            System.out.println("2. Deleted the products");
            System.out.println("3. last to be added");
            System.out.println("4. Exit");
            System.out.println("Enter the option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addStack(productos, scanner);
                    break;
                case 2:
                    deleteStack(productos, scanner);
                    break;
                case 3:
                    last(productos);
                    break;
                case 4:
                    System.out.println("Bye..");
                    exit = true;
                    break;
                default:
                    System.out.println("The option enter is invalid");
            }
        }
    }

    public static void addStack(Stack<String> productos, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the cant to add:");
        int cant = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cant; i++) {
            System.out.println("Enter the name to product:");
            String productName = scanner.nextLine();
            productos.push(productName);
        }
        details(productos);
    }

    public static void deleteStack(Stack<String> productos, Scanner scanner) {
        scanner.nextLine();

        if (!productos.isEmpty()) {
            System.out.println("Enter the cant to product do you want to remove from the top:");
            int cant = scanner.nextInt();
            for (int i = 0; i < cant; i++) {
                productos.pop();
                details(productos);
            }
        } else {
            System.out.println("There are not products =(");
        }
    }

    public static void last(Stack<String> productos) {
        if (!productos.isEmpty()) {
            System.out.println("\nThe product last is:");
            System.out.println(productos.peek());
        } else
            System.out.println("There are not products =(");
    }

    public static void details(Stack<String> productos) {
        System.out.println("\nThe products is:");
        for (String product : productos) {
            System.out.println("- " + product);
        }
    }
}
