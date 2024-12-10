package HackerRankPractica;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        ArrayList<String[]> number = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            String numbers = scanner.nextLine();
            number.add(numbers.split(" "));
        }

        int size2 = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size2; i++) {
            String queries = scanner.nextLine();
            String[] index = queries.split(" ");
            int key = Integer.parseInt(index[0]) - 1;
            int values = Integer.parseInt(index[1]);
            if (key < number.size() && values < number.get(key).length) {
                System.out.println(number.get(key)[values]);
            } else {
                System.out.println("!ERROR");
            }
        }


    }
}
