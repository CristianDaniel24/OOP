package Regex;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        String regex = "^3\\d{9}$";

        if (number.matches(regex)) {
            System.out.println("The " + number + " is valid");
        } else {
            System.out.println("The " + number + " it's not valid");
        }
    }
}
