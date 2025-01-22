package christmasChallenge.day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Day5 {

    public static final String PATH = "src/christmasChallenge/day5/Text";

    public static void main(String[] args) {
        try {
            List<String> text = Files.readAllLines(Path.of(PATH));
            List<String> instructionsList = new LinkedList<>();
            List<String> pagesList = new LinkedList<>();

            text.forEach(line -> {
                if (line.isEmpty()) {
                    return;
                }
                if (line.contains("|")) {
                    instructionsList.add(line);
                } else {
                    pagesList.add(line);
                }
            });

            List<List<Integer>> instructions = instructionsList.stream()
                    .map(line -> Arrays.stream(line.split("\\|"))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList())).toList();
            List<List<Integer>> pages = pagesList.stream()
                    .map(line -> Arrays.stream(line.split(","))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList())).toList();

            List<List<Integer>> listValid = new LinkedList<>();
            List<List<Integer>> invalidLines = new LinkedList<>();

            verifyPages(pages, instructions, listValid, invalidLines);

            // Ordenar las instrucciones
            List<List<Integer>> instructionsSorted = sortInstructions(instructions);
            System.out.println("Instrucciones ordenadas:");
            instructionsSorted.forEach(System.out::println);

            // Ordenar las lineas invalidas
            List<List<Integer>> orderInvalidLines = orderInvalidLines(invalidLines, instructionsSorted);

            int total = sumNumbers(orderInvalidLines);

            System.out.println("\nThe result is: " + total);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public static void verifyPages(List<List<Integer>> pages, List<List<Integer>> instructions, List<List<Integer>> listValid, List<List<Integer>> invalidLines) {
        pages.forEach(page -> {
            boolean isValid = instructions.stream()
                    .allMatch(instruction -> {
                        int left = instruction.get(0);
                        int right = instruction.get(1);
                        int leftIndex = page.indexOf(left);
                        int rightIndex = page.indexOf(right);

                        if (leftIndex == -1 || rightIndex == -1) {
                            return true;
                        }
                        return leftIndex < rightIndex;
                    });
            if (isValid) {
                listValid.add(page);
            } else {
                invalidLines.add(page);
            }
        });
    }

    public static List<List<Integer>> sortInstructions(List<List<Integer>> instructions) {
        return instructions.stream()
                .sorted(Comparator.comparingInt((List<Integer> instruction) -> instruction.getFirst())
                        .thenComparingInt(instruction -> instruction.get(1))) // Ordena por el numero de la derecha en caso de empate
                .toList();
    }

    public static List<List<Integer>> orderInvalidLines(List<List<Integer>> invalidLines, List<List<Integer>> instructionsOrder) {
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> line : invalidLines) {
            boolean isOrdered;

            // Ordenar hasta que no hayan mas cambios
            do {
                isOrdered = true;
                for (int i = 0; i < line.size(); i++) {
                    int currentNumber = line.get(i);

                    // Buscar todas las instrucciones donde el numero actual es la izquierda
                    List<List<Integer>> matchingInstructions = instructionsOrder.stream()
                            .filter(instruction -> instruction.get(0) == currentNumber)
                            .toList();

                    for (List<Integer> instruction : matchingInstructions) {
                        int left = instruction.get(0);
                        int right = instruction.get(1);

                        int leftIndex = line.indexOf(left);
                        int rightIndex = line.indexOf(right);

                        // Corregir el orden
                        if (rightIndex != -1 && rightIndex < leftIndex) {
                            // Eliminar right de su posicion actual
                            line.remove(rightIndex);

                            // Reinsertar right en la posicion correcta
                            if (leftIndex + 1 >= line.size()) {
                                line.add(right);
                            } else {
                                line.add(leftIndex + 1, right);
                            }
                            isOrdered = false; // Si se detecta un cambio hay que seguir
                        }
                    }
                }
            } while (!isOrdered);

            result.add(line);
        }
        return result;
    }

    public static int sumNumbers(List<List<Integer>> listValid) {
        return listValid.stream()
                .filter(line -> line.size() % 2 != 0)
                .mapToInt(line -> line.get(line.size() / 2))
                .sum();
    }
}
