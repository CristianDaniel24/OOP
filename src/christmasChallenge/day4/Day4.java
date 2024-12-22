package christmasChallenge.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day4 {

    public static final String PATH = "src/christmasChallenge/day4/Text";

    public static void main(String[] args) throws IOException {
        List<String> text = Files.readAllLines(Path.of(PATH));

        char[][] listBidi = convertBidi(text);

        String word = "XMAS";
        int count = countOccurrences(listBidi, word);
        System.out.println("The count is: " + count);
    }

    public static char[][] convertBidi(List<String> text) {
        int rows = text.size();
        int cols = text.get(0).length();
        char[][] bidi = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            bidi[i] = text.get(i).toCharArray();
        }
        return bidi;
    }

    public static int countOccurrences(char[][] listBidi, String word) {
        int count = 0;
        int rows = listBidi.length;
        int cols = listBidi[0].length;

        int[][] directions = {
                {0, 1}, {0, -1},    // Horizontal derecha, izquierda
                {1, 0}, {-1, 0},    // Vertical abajo, arriba
                {1, 1}, {-1, -1},   // Diagonal derecha abajo, izquierda arriba
                {1, -1}, {-1, 1}    // Diagonal izquierda abajo, derecha arriba
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Verificar las direcciones
                for (int[] dir : directions) {
                    if (checkWord(listBidi, new StringBuilder(word).reverse().toString(), i, j, dir[0], dir[1])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean checkWord(char[][] matrix, String word, int startRow, int startCol, int deltaRow, int deltaCol) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int k = 0; k < word.length(); k++) {
            int newRow = startRow + k * deltaRow;
            int newCol = startCol + k * deltaCol;

            // Si esta fuera de los limites no seria valido
            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) {
                return false;
            }

            // Y si el caracter no coincide no es valido
            if (matrix[newRow][newCol] != word.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}
