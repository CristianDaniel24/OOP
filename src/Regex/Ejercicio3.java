package Regex;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correos = scanner.nextLine();
        String regex = "^[a-zA-Z]{1}[a-zA-Z0-9.]{3,}@[a-zA-Z]+\\.(com|co\\.uk|outlook\\.com)$";

        if (correos.matches(regex)) {
            System.out.println("The mail: " + correos + " is valid");
        } else {
            System.out.println("The mail: " + correos + " it's not valid");
        }
    }
}
