package dataStructures;

import dataStructures.entities.Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EjercicioPersonaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Carlos", 20));
        personas.add(new Persona("Alejo", 40));
        personas.add(new Persona("Joaquin", 32));
        System.out.println("Persons");
        list(personas);

        //add(personas, scanner);

        delete(personas, scanner);

        //search(personas, scanner);

        //sort(personas);
    }

    public static void add(ArrayList<Persona> personas, Scanner scanner) {

        System.out.println("\nEnter the person add:");
        String addPerson = scanner.nextLine();

        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        personas.add(new Persona(addPerson, age));
        list(personas);
    }

    public static void delete(ArrayList<Persona> personas, Scanner scanner) {
        System.out.println("\nEnter the person to delete");
        String deletePerson = scanner.nextLine();
        Persona personaEncontrada = new Persona();
        boolean deletedPerson = false;
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(deletePerson)) {
                personaEncontrada = persona;
                personas.remove(personaEncontrada);
                deletedPerson = true;
                break;
            }
        }
        if (deletedPerson) {
            System.out.println("\nthe person is successfully eliminated");
        } else {
            System.out.println("\nThe person is invalid");
        }
        list(personas);
    }

    public static void search(ArrayList<Persona> personas, Scanner scanner) {
        System.out.println("Enter the Person to search");
        String personSearch = scanner.nextLine();
        for (Persona persona : personas) {
            if (persona.getNombre().equals(personSearch)) {
                System.out.println("The Person: " + personSearch + " yes exists");
            } else {
                System.out.println("The person: " + personSearch + " not exists");
            }
        }
        list(personas);
    }

    public static void sort(ArrayList<Persona> personas) {
        personas.sort(Comparator.comparing(Persona::getNombre));
        System.out.println("\nAscending people:");
        list(personas);

        personas.sort((Persona p1, Persona p2) -> p2.getNombre().compareTo(p1.getNombre()));
        System.out.println("\nDescendant people:");
        list(personas);
    }

    public static void list(ArrayList<Persona> personas) {
        System.out.println("\nThe list of Person are:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }
    }
}
