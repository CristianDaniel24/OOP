package christmasChallenge.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String PATH = "src/christmasChallenge/day3/Text.txt";

    public static void main(String[] args) throws IOException {
        List<String> texts = Files.readAllLines(Path.of(PATH));

        List<String> validMulList = new LinkedList<>();
        Pattern pattern = Pattern.compile("do\\(\\)|don't\\(\\)|mul\\(\\d+,\\d+\\)");

        //true para validar antes del primer don't()
        boolean isValid = true;
        for (String text : texts) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String match = matcher.group();
                if (match.equals("don't()")) {
                    isValid = false;
                } else if (match.equals("do()")) {
                    isValid = true;
                } else if (match.startsWith("mul(") && isValid) {
                    validMulList.add(match);
                }
            }
        }

        int totalSum = validMulList.stream()
                .mapToInt(Main::calculateMultiply)
                .sum();

        System.out.println("The total is: " + totalSum);
    }
    
    private static int calculateMultiply(String mulExpression) {
        Pattern numberPattern = Pattern.compile("\\d+"); //Se consiguen los numeros
        Matcher matcher = numberPattern.matcher(mulExpression);

        int num1 = 0, num2 = 0;
        if (matcher.find()) {
            num1 = Integer.parseInt(matcher.group());
        }
        if (matcher.find()) {
            num2 = Integer.parseInt(matcher.group());
        }
        return num1 * num2;
    }
}
