package operadoresLogicos;

import java.util.Scanner;

public class Negacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text");
        String texto = scanner.nextLine();

        if (!texto.isEmpty()) {
            System.out.println("The text is not empty");
        } else {
            System.out.println("The text is empty");
        }
    }
}
