package operadoresLogicos;

import java.util.Scanner;

public class NegacionIgual2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra = 'a';

        if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
            System.out.println("The letter is not vocal");
        } else {
            System.out.println("The letter is vocal");
        }
    }
}
