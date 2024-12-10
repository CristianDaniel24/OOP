package ToLowerCase;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first person:");
        String person1 = scanner.nextLine();

        System.out.print("Enter the name of the second person:");
        String person2 = scanner.nextLine();

        if (person1.toLowerCase().equals(person2.toLowerCase())) {
            System.out.println("The names are the same");
        } else {
            System.out.println("The names are different");
        }
    }
}
