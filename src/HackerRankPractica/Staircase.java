package HackerRankPractica;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        stairCase(n);


    }

    public static void stairCase(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + n + "%s%n", "#".repeat(i));
        }
    }
}
