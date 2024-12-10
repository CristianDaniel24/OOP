package Hasmap.Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static HashMap<Person, String> register = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n---MENU---");
            System.out.println("1. Add person");
            System.out.println("2. Deleted person");
            System.out.println("3. List persons");
            System.out.println("4. Exit");
            System.out.print("Enter the option:");
            int option = Integer.parseInt(reader.readLine());

            switch (option) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    deletedPerson();
                    break;
                case 3:
                    listPerson();
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

    private static void addPerson() throws IOException {
        System.out.print("\nEnter the id of the person: ");
        int id = Integer.parseInt(reader.readLine());
        System.out.print("Enter the name of person:");
        String name = reader.readLine();

        Person persona = new Person(id, name);
        register.put(persona, name);
        System.out.println("\nPerson added successfully");
    }

    private static void deletedPerson() throws IOException {
        System.out.print("\nEnter the id of person to deleted:");
        int id = Integer.parseInt(reader.readLine());

        Person personDeleted = searchPersonId(id);
        if (personDeleted != null) {
            register.remove(personDeleted);
            System.out.println("\nPerson deleted");
        } else {
            System.out.println("\nPerson not find");
        }
    }

    private static void listPerson() {
        if (register.isEmpty()) {
            System.out.println("\nThere are no registered people");
        } else {
            for (Map.Entry<Person, String> entry : register.entrySet()) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static Person searchPersonId(int id) {
        for (Person persona : register.keySet()) {
            if (persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }
}
