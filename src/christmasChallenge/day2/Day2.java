package christmasChallenge.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day2 {

    public static final String PATH = "src/christmasChallenge/day2/numbers";

    public static void main(String[] args) throws IOException {
        int safe = 0;
        int danger = 0;
        int numberline = 1;

        List<List<Integer>> numbers = Files.readAllLines(Path.of(PATH))
                .stream().map(line -> Arrays.stream(line.split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        for (List<Integer> list : numbers) {
            boolean result = isSafe(list);
            boolean canBeMadeSafe = canBeMadeSafe(list);
            if (result || canBeMadeSafe) {
                System.out.printf("Line: %d is safe%n", numberline);
                numberline++;
                safe++;
            } else {
                System.out.printf("Line: %d is danger%n", numberline);
                numberline++;
                danger++;
            }
        }

        int total = safe + danger;
        System.out.println("\nInformes seguros: " + safe);
        System.out.println("Informes inseguros: " + danger);
        System.out.println("Informes totales: " + total);
    }

    public static boolean isSafe(List<Integer> list) {
        int diff = Math.abs(list.get(0) - list.get(1));
        System.out.println(diff);

        if (diff > 3 || list.get(0).equals(list.get(1))) {
            return false;
        }

        boolean increase = list.get(0) < list.get(1);
        for (int i = 1; i < list.size() - 1; i++) {
            int difference = Math.abs(list.get(i) - list.get(i + 1));
            boolean isIncrease = list.get(i) < list.get(i + 1);

            if (list.get(i).equals(list.get(i + 1)) || difference > 3 || increase != isIncrease) {
                return false;
            }
        }
        return true;
    }

    public static boolean canBeMadeSafe(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            List<Integer> listModify = new ArrayList<>(list);
            listModify.remove(i);
            System.out.println("HI");
            if (isSafe(listModify)) {
                return true;
            }
        }
        return false;
    }
}
