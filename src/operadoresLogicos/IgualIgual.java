package operadoresLogicos;

import java.util.Scanner;

public class IgualIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 5;
        int numero2 = 5;

        if (numero1 == numero2) {
            System.out.println("The numbers is equal");
        } else {
            System.out.println("The numbers are not the same");
        }
    }
}
