package Practice.Practice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pets> pets = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu pets");
            System.out.println("1. Add pets");
            System.out.println("2. Delete pets");
            System.out.println("3. Search pets");
            System.out.println("4. Exit");
            System.out.println("Enter the option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    add(pets, scanner);
                    break;
                case 2:
                    delete(pets, scanner);
                    break;
                case 3:
                    search(pets, scanner);
                    break;
                case 4:
                    System.out.println("Bye..");
                    exit = true;
                    break;
                default:
                    System.out.println("\nThe option is invalid");
            }
        }
    }

    public static void add(ArrayList<Pets> pets, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the name of the pet:");
        String name = scanner.nextLine();
        System.out.println("Enter the stock:");
        int stock = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the tipe");
        String tipe = scanner.nextLine();

        Pets pets1 = new Pets(name, stock, tipe);
        pets.add(pets1);
        System.out.println("\nThe pet enter is:");
        for (Pets pets2 : pets) {
            System.out.println("\nName: " + pets2.getName() + "\nStock: " + pets1.getStock() + "\nTipe: " + pets2.getTipe());
        }
    }

    public static void delete(ArrayList<Pets> pets, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the pet to delete:");
        String nameDelete = scanner.nextLine();
        boolean delete = false;
        Pets pets1 = new Pets();
        for (Pets pets2 : pets) {
            if (pets2.getName().equalsIgnoreCase(nameDelete)) {
                pets1 = pets2;
                delete = true;
            }
        }
        if (delete) {
            pets.remove(pets1);
            System.out.println("\nThe deleted is successfully");
            System.out.println("Pets:");
            for (Pets pets2 : pets) {
                System.out.println("\nName: " + pets2.getName() + "\nStock: " + pets1.getStock() + "\nTipe: " + pets2.getTipe());
            }
        } else {
            System.out.println("\nThe pet enter is invalid");
        }
    }

    public static void search(ArrayList<Pets> pets, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the pet to search:");
        String searchPet = scanner.nextLine();
        boolean search = false;
        for (Pets pets1 : pets) {
            if (pets1.getName().equalsIgnoreCase(searchPet)) {
                search = true;
            }
        }
        if (search) {
            System.out.println("The pet yes exists in the list");
        } else {
            System.out.println("The search is invalid");
        }
    }
}
