package operadoresLogicos;

import java.util.Scanner;

public class Or {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWELCOME TO YOUR TRUSTED RESTAURANT");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nToday's Menu:");
            System.out.println("1. Pasta and caldo");
            System.out.println("2. bandeja paisa and caldo");
            System.out.println("3. Exit");
            System.out.println("Enter an option:");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿You want the pasta?true/false");
                    boolean orderPasta = scanner.nextBoolean();
                    System.out.println("¿You want the caldo?true/false");
                    boolean orderPastaCaldo = scanner.nextBoolean();
                    if (orderPasta || orderPastaCaldo)
                        System.out.println("Placing order..");
                    else {
                        System.out.println("Order not available or invalid");
                    }
                    return;
                case 2:
                    System.out.println("¿You want the bandeja paisa?");
                    boolean orderBandejaPaisa = scanner.nextBoolean();
                    System.out.println("¿You want with a caldo?");
                    boolean orderBandejaCaldo = scanner.nextBoolean();
                    if (orderBandejaPaisa || orderBandejaCaldo)
                        System.out.println("Placing order..");
                    else
                        System.out.println("Out of stock or invalid order");
                    return;
                case 3:
                    exit = true;
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}