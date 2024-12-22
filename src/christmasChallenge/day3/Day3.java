package christmasChallenge.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Day3 {

    public static final String PATH = "src/christmasChallenge/day3/Text.txt";

    public static void main(String[] args) throws IOException {

        List<String> texts = Files.readAllLines(Path.of(PATH));
        //System.out.println(text);

        List<String> dontList = new LinkedList<>();
        List<String> doList = new LinkedList<>();
        for (String text : texts) {
            dontList = Arrays.stream(text.split("don't\\(\\)"))
                    .toList();

            doList = Arrays.stream(text.split("(?=do\\(\\)|don't\\(\\))"))
                    .toList();
        }

        doList.forEach(System.out::println);

        boolean continueBeforeDont = true;
        int sumToal = 0;

        for (String line : doList) {
            if (line.contains("don't()")) {
                continueBeforeDont = false;
                continue;
            }

            if (continueBeforeDont || line.contains("do()")) {
                sumToal += Arrays.stream(line.split("mul\\("))
                        .filter(part -> part.matches("\\d+,\\d+\\).*"))
                        .mapToInt(Day3::calculateMultiplication)
                        .sum();
            }
        }
        System.out.println("Result final: " + sumToal);
/*
        List<String> doListFinal = doList.stream()
                .filter(line -> line.contains("do()"))
                .toList();

        int result = calculateMultiplicate(doListFinal);
        System.out.println("Result final: " + result);
    }

    public static int calculateMultiplicate(List<String> doListFinal) {
        Pattern pattern = Pattern.compile("mul\\((\\d+),(\\d+)\\)");

        int totalSum = 0;
        for (String line : doListFinal) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                int num1 = Integer.parseInt(matcher.group(1));
                int num2 = Integer.parseInt(matcher.group(2));

                int result = num1 * num2;

                totalSum += result;
            }
        }
        return totalSum;
    }
}
*/
    }

    public static int calculateMultiplication(String part) {
        String[] nums = part.split("[^\\d+]");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        return num1 * num2;
    }
}