package christmasChallenge.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static final String PATH = "src/christmasChallenge/day4/Text";

    public static void main(String[] args) throws IOException {

        List<String> list = Files.readAllLines(Path.of(PATH));

        int[][] diagonalOne = {
                {-1, -1},
                {0, 0},
                {1, 1}
        };
        int[][] diagonalTwo = {
                {-1, 1},
                {0, 0},
                {1, -1}
        };

        int count = 0;
        //Se empieza a iterar
        for (int row = 0; row < list.size(); row++) {
            for (int col = 0; col < list.get(0).length(); col++) {

                if (list.get(row).charAt(col) == 'A') {// Se busca la letra A
                    // Despues de coincidir con la A se continua
                    StringBuilder wordOne = new StringBuilder();
                    StringBuilder wordTwo = new StringBuilder();
                    for (int[] directionOne : diagonalOne) {
                        isXPattern(list, row, col, directionOne, wordOne);
                    }
                    for (int[] directionTwo : diagonalTwo) {
                        isXPattern(list, row, col, directionTwo, wordTwo);
                    }
                    //System.out.println("Word builder One: " + wordOne);
                    //System.out.println("Word builder Two: " + wordTwo);
                    if ((wordOne.toString().equals("MAS") || wordOne.toString().equals("SAM")) && (wordTwo.toString().equals("MAS") || wordTwo.toString().equals("SAM"))) {
                        System.out.println("Row: " + row);
                        System.out.println("Col: " + col);
                        count++;
                    }
                }
            }
        }
        System.out.println("The count is: " + count);
    }

    public static void isXPattern(List<String> matrix, int row, int col, int[] direction, StringBuilder resultWordFound) {
        try {
            // Se calcula las posiciones de las letras
            int currentRow = row + direction[0]; // Movimiento en las filas
            int currentCol = col + direction[1]; // Movimiento en las columnas
            // Verificamos si la letra coincide
            resultWordFound.append(matrix.get(currentRow).charAt(currentCol));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("EXEPTION FOUND");
            // Si se sale de los limites no es una palabra valida
        }
    }
}
