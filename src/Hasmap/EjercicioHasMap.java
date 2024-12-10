package Hasmap;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioHasMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se crea un HashMap
        HashMap<String, Integer> edad = new HashMap<>();

        boolean exit = false;
        while (!exit) {
            System.out.printf("%nMenu to Person:");
            System.out.printf("%n1. Add to Person:");
            System.out.printf("%n2. Deleted to Person:");
            System.out.printf("%n3. Search Person:");
            System.out.printf("%n4. Details to Persons:");
            System.out.printf("%n5. Exit:");
            System.out.printf("%nEnter the option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    add(edad, scanner);
                    break;
                case 2:
                    deleted(edad, scanner);
                    break;
                case 3:
                    search(edad, scanner);
                    break;
                case 4:
                    details(edad);
                    break;
                case 5:
                    System.out.printf("%nBye..");
                    exit = true;
                    break;
                default:
                    System.out.printf("%nThe option is invalid%n");
                    break;
            }
        }
    }

    public static void add(HashMap<String, Integer> edad, Scanner scanner) {
        scanner.nextLine();
        System.out.printf("%nEnter the name of the Person:");
        String name = scanner.nextLine();
        System.out.printf("Enter the age:");
        int age = scanner.nextInt();

        // Se Agregan los nombres y las edades al HashMap
        edad.put(name, age);
    }

    public static void deleted(HashMap<String, Integer> edad, Scanner scanner) {
        if (!edad.isEmpty()) {
            scanner.nextLine();
            System.out.printf("%nEnter the name of Person to delete:");
            String nameDelete = scanner.nextLine();
            if (edad.containsKey(nameDelete)) {
                // Eliminar un elemento
                edad.remove(nameDelete);
                System.out.printf("%n");
                details(edad);
            } else
                System.out.printf("The name is invalid or not exists");
        } else {
            System.out.printf("%nNot exists Persons =(%n");
        }
    }

    public static void search(HashMap<String, Integer> edad, Scanner scanner) {
        if (!edad.isEmpty()) {
            scanner.nextLine();
            // Acceder a un valor en específico
            System.out.printf("%nEnter the name to search:");
            String nameSearch = scanner.nextLine();
            if (edad.containsKey(nameSearch)) {
                System.out.printf(nameSearch + " has " + edad.get(nameSearch) + " age");
            } else {
                System.out.printf("Not found " + nameSearch + " in the HashMap");
            }
        } else {
            System.out.printf("%nNot exists Persons =(%n");
        }
    }

    public static void details(HashMap<String, Integer> edad) {
        System.out.printf("%nThe HashMap has:");
        for (String nombres : edad.keySet()) {
            System.out.printf("%nName:%s", nombres + " has " + edad.get(nombres) + " age");
        }
        System.out.printf("%n");
    }
}