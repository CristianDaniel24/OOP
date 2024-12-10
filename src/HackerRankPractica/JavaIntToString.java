package HackerRankPractica;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String texto = Integer.toString(number);

        if (number == Integer.parseInt(texto)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
