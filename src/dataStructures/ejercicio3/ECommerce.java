package dataStructures.ejercicio3;

import java.util.LinkedList;
import java.util.Scanner;

public class ECommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Productos> productosLinkedList = new LinkedList<>();

        LinkedList<Productos> productsMerge = new LinkedList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMENU PRODUCTS");
            System.out.println("1. Add Product");
            System.out.println("2. Most expensive Product");
            System.out.println("3. Rotate Products");
            System.out.println("4. Merge lists");
            System.out.println("5. Exit");
            System.out.println("Enter the option:");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    add(productosLinkedList, scanner);
                    break;
                case 2:
                    expensive(productosLinkedList);
                    break;
                case 3:
                    rotate(productosLinkedList, scanner);
                    break;
                case 4:
                    merge(productosLinkedList, productsMerge, scanner);
                    break;
                case 5:
                    System.out.println("Bye..");
                    exit = true;
                    break;
                default:
                    System.out.println("The option is invalid");
            }
        }
    }

    public static void add(LinkedList<Productos> productosLinkedList, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the Stock:");
        int stock = scanner.nextInt();
        System.out.println("Enter the Price:");
        Double price = scanner.nextDouble();

        Productos productos = new Productos(name, stock, price);
        productosLinkedList.add(productos);
        System.out.println("The product was added successfully");
        System.out.println("\nThe aggregate product is:");
        details(productosLinkedList);
    }

    public static void expensive(LinkedList<Productos> productosLinkedList) {
        double productExpensive = 0;
        String nameProductExpensive = "";

        for (Productos productos : productosLinkedList) {
            if (productos.getPrecio() > productExpensive) {
                productExpensive = productos.getPrecio();
                nameProductExpensive = productos.getNombre();
            }
        }
        System.out.println("The product " + nameProductExpensive + " is the most expensive, it costs: " + productExpensive);
    }

    public static void rotate(LinkedList<Productos> productosLinkedList, Scanner scanner) {
        System.out.println("Enter the numbers to rotate:");
        int rotate = scanner.nextInt();
        // Obtener la longitud de la lista
        int longitud = productosLinkedList.size();

        for (int i = 0; i < rotate; i++) {
            Productos lastElement = productosLinkedList.removeLast();
            productosLinkedList.addFirst(lastElement);
        }
        details(productosLinkedList);
    }

    public static void merge(LinkedList<Productos> productosLinkedList, LinkedList<Productos> productsMerge, Scanner scanner) {
        scanner.nextLine();
        System.out.println("ARRAY 2");
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the stock:");
        int stock = scanner.nextInt();
        System.out.println("Enter the price:");
        Double price = scanner.nextDouble();
        Productos productos = new Productos(name, stock, price);
        productsMerge.add(productos);

        productosLinkedList.addAll(productsMerge);
        System.out.println("\nThe list merge is:");
        details(productosLinkedList);
    }

    public static void details(LinkedList<Productos> productosLinkedList) {
        for (Productos productos1 : productosLinkedList) {
            System.out.println("\n- Name: " + productos1.getNombre() + "\n- Stock: " + productos1.getStock() +
                    "\n- Price: " + productos1.getPrecio());
        }
    }
}
