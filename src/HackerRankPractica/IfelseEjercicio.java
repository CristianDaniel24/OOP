package HackerRankPractica;

import java.util.Scanner;

public class IfelseEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number % 2 == 0) {
            if (number >= 6 && number <= 20) {
                System.out.println("weird");
            } else {
                System.out.println("not weird");
            }
        } else {
            System.out.println("weird");
        }
    }
}
