package christmasChallenge.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Day1 {

    public static final String PATH = "src/christmasChallenge/day1/Numbers";

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(PATH));
        List<Integer> numbersLeft = new LinkedList<>();
        List<Integer> numbersRight = new LinkedList<>();

        for (String line : lines) {
            String[] numbers = line.trim().split("\\s+");

            if (numbers.length >= 2) {
                numbersLeft.add(Integer.parseInt(numbers[0]));
                numbersRight.add(Integer.parseInt(numbers[1]));
            }
        }

        Collections.sort(numbersLeft);
        Collections.sort(numbersRight);

        int result = IntStream.range(0, numbersLeft.size())
                .map(i -> Math.abs(numbersLeft.get(i) - numbersRight.get(i))).sum();

        System.out.println(result);

        //PART 2
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : numbersRight) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        //Agarra los numeros de la izquiera y los multiplica por las ocurrencias de la derecha
        int frequencyTotal = numbersLeft.stream()
                .mapToInt(num -> num * frequency.getOrDefault(num, 0))
                .sum();

        System.out.println(frequencyTotal);
    }
}
