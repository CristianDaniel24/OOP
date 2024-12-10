package thread.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExecutorExercice implements Runnable {
    private String path;
    private String wordSearch;
    private List<Integer> amountWords = new ArrayList<>();
    private int totalWords;

    public ExecutorExercice(String path, String wordSearch) {
        this.path = path;
        this.wordSearch = wordSearch;
    }

    public int getTotalWords() {
        return totalWords;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(this.wordSearch)) {
                    amountWords.add(1);
                    int total = amountWords.stream().mapToInt(Integer::intValue).sum();
                    printFound(path);
                    this.totalWords = total;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printFound(String path) {
        System.out.println("Found " + this.wordSearch + " in " + path);
    }
}
