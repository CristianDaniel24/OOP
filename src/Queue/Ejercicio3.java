package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Customer> row = new LinkedList<Customer>();

        System.out.printf("%nWELCOME TO THE WAITING LINE");
        int suma = 0;
        boolean exit = false;
        while (!exit) {
            System.out.printf("%nMenu to row");
            System.out.printf("%n1. Add to Customer");
            System.out.printf("%n2. Serve client");
            System.out.printf("%n3. Row details");
            System.out.printf("%n4. Exit");
            System.out.printf("%nEnter to option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    suma++;
                    add(row, scanner, suma);
                    break;
                case 2:
                    serve(row);
                    break;
                case 3:
                    details(row);
                    break;
                case 4:
                    System.out.printf("%nBye..");
                    exit = true;
                    break;
                default:
                    System.out.printf("%nThe option is invalid :(");
            }
        }
    }

    public static void add(Queue<Customer> row, Scanner scanner, int suma) {
        scanner.nextLine();
        System.out.printf("%nEnter the name:");
        String name = scanner.nextLine();
        System.out.printf("Enter the order:");
        String order = scanner.nextLine();
        Customer customer = new Customer(name, order);
        row.add(customer);
        System.out.printf("%nOrder placed successfully, order number: #" + suma);
        details(row);
    }

    public static void serve(Queue<Customer> row) {
        if (!row.isEmpty()) {
            Customer customerPoll = row.poll();
            System.out.printf("%nThe request for: " + customerPoll.getName() + " and it order is: " + customerPoll.getOrder());
            System.out.printf("%nRemaining services: " + row.size());
            System.out.printf("%n");
        } else {
            System.out.printf("The row is empty =(%n");
        }
    }

    public static void details(Queue<Customer> row) {
        System.out.printf("%n");
        if (!row.isEmpty()) {
            System.out.printf("%nThe row is:");
            for (Customer details : row) {
                System.out.printf("%n-Name: " + details.getName() + "%n-Order: " + details.getOrder());
            }
        } else {
            System.out.printf("%nThe row is empty =(");
        }
        System.out.printf("%n");
    }
}
