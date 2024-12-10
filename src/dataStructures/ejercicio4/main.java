package dataStructures.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Crear la clase Computador: nombre,referencia,precio
        ADD,EDITAR,ORDENAR NOMBRE Y PRECIO ASC, ELIMINAR
         */

        ArrayList<Computer> computers = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu computers:");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Order");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Enter the option:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    add(computers, scanner);
                    break;
                case 2:
                    edit(computers, scanner);
                    break;
                case 3:
                    order(computers);
                    break;
                case 4:
                    delete(computers, scanner);
                    break;
                case 5:
                    System.out.println("Bye..");
                    exit = true;
                    break;
                default:
                    System.out.println("\nThe option is invalid");
            }
        }
    }

    public static void add(ArrayList<Computer> computers, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the name the computer for add:");
        String name = scanner.nextLine();
        System.out.println("Enter the reference:");
        int reference = scanner.nextInt();
        System.out.println("Enter the price:");
        Double price = scanner.nextDouble();

        Computer computer = new Computer(name, price, reference);

        computers.add(computer);
        System.out.println("The computers adds are:");
        list(computers);
    }

    public static void edit(ArrayList<Computer> computers, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the new name:");
        String newName = scanner.nextLine();
        boolean exist = false;
        for (Computer computer : computers) {
            if (computer.getName().equalsIgnoreCase(newName)) {
                computer.setName(newName);
                System.out.println("Enter the new reference:");
                int newReference = scanner.nextInt();
                computer.setReference(newReference);
                System.out.println("Enter the new price:");
                Double newPrice = scanner.nextDouble();
                computer.setPrecio(newPrice);
                exist = true;
            }
        }
        if (exist) {
            list(computers);
        } else {
            System.out.println("\nThe Computer not exists");
        }
    }

    public static void order(ArrayList<Computer> computers) {
        System.out.println("\nThe computers is order ascending is:");
        computers.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Computer computer : computers) {
            System.out.println(computer.getName());
        }

        System.out.println("\nThe order for price");
        computers.sort((o1, o2) -> o1.getPrecio().compareTo(o2.getPrecio()));

        for (Computer computer : computers) {
            System.out.println(computer.getPrecio());
        }
    }

    public static void delete(ArrayList<Computer> computers, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the computer for delete:");
        String computerDelete = scanner.nextLine();
        boolean delete = false;
        Computer computer2 = new Computer();
        for (Computer computer1 : computers) {
            if (computer1.getName().equalsIgnoreCase(computerDelete)) {
                computer2 = computer1;
                delete = true;
                break;
            }
        }
        if (delete) {
            computers.remove(computer2);
            System.out.println("The computer is deleted");
            System.out.println("\nThe computers are:");
            list(computers);
        } else {
            System.out.println("The computer not deleted or invalid");
        }
    }

    public static void list(ArrayList<Computer> computers) {
        for (Computer computer : computers) {
            System.out.println("\nName: " + computer.getName() + "\nPrice: " + computer.getPrecio() + "\nReference: " + computer.getReference());
        }
    }

}
