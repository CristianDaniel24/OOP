package HackerRankPractica;

import java.util.Scanner;

public class JavaOutputEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = scanner.nextLine();
            int n = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s, n);
        }
        System.out.println("================================");
    }
}
