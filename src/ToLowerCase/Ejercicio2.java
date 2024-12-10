package ToLowerCase;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] word = text.split(" ");
        int counter = 0;

        for (String words : word) {
            // Convertir la primera letra a minúscula y se verifica si es "a"
            if (words.toUpperCase().startsWith("A")) {
                counter++;
            }
        }
        System.out.println("Words that start with a: " + counter);
    }
}
