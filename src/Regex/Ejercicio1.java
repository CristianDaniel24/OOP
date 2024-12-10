package Regex;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+$";
    
        if (name.matches(regex)) {
            System.out.println("The name: " + name + " is valid");
        } else {
            System.out.println("The name: " + name + " it's not valid");
        }
    }
}
