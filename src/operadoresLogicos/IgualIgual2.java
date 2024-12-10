package operadoresLogicos;

import java.util.Scanner;

public class IgualIgual2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cadena1 = "Hello";
        String cadena2 = "Hello";

        if (cadena1 == cadena2) {
            System.out.println("The text is equal");
        } else {
            System.out.println("The text are not the same");
        }
    }
}
