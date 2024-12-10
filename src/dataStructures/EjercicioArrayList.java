package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EjercicioArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> schoolSupplies = new ArrayList<>();
        System.out.println("WELCOME TO THE LIST OF SCHOOL SUPPLIES");

        //ADD
        System.out.println("\nADD");
        schoolSupplies.add("Pencil");
        schoolSupplies.add("Draft");
        schoolSupplies.add("Sphere");
        System.out.println("Enter the school spplies:");
        String add = scanner.nextLine();
        schoolSupplies.add(add);
        System.out.println("------------------------------------");

        //SEARCH
        System.out.println("\nSEARCH");
        System.out.println("Enter your search:");
        String search = scanner.nextLine();

        if (schoolSupplies.contains(search)) {
            System.out.println("The " + search + " yes exist in the list");
        } else {
            System.out.println("The " + search + " not exit in the list");
        }
        System.out.println("------------------------------------");
        //ORDER
        //UPWARD
        Collections.sort(schoolSupplies);
        System.out.println("\nORDER");
        System.out.println("Upward list: " + schoolSupplies);
        //FALLING
        schoolSupplies.sort(Comparator.reverseOrder());
        System.out.println("Falling list " + schoolSupplies);
        System.out.println("------------------------------------");

        //UPDATE
        System.out.println("\nUPDATE");
        schoolSupplies.add(1, "Book");
        System.out.println("\nThe list update is: " + schoolSupplies);
        System.out.println("------------------------------------");

        //DELETE
        System.out.println("\nDELETE");
        System.out.println("Enter the school supplies to delete");
        String delete = scanner.nextLine();
        if (schoolSupplies.contains(delete)) {
            schoolSupplies.remove(delete);
            System.out.println("The " + delete + " was successfully removed");
            System.out.println("\nThe remaining items are:");
            for (String deleted : schoolSupplies) {
                System.out.println(deleted);
            }
        } else {
            System.out.println("The " + delete + " is invalid or does not exit");
        }
    }
}