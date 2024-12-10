package thread.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ExecutorService executor = Executors.newFixedThreadPool(5);
        String file1Path = "src/thread/ejercicio3/File1.txt";
        String file2Path = "src/thread/ejercicio3/File2.txt";
        String file3Path = "src/thread/ejercicio3/File3.txt";
        String file4Path = "src/thread/ejercicio3/File4.txt";
        String file5Path = "src/thread/ejercicio3/File5.txt";

        System.out.println("Enter the word to search: ");
        String wordSearch = reader.readLine();
        ExecutorExercice executorFile1 = new ExecutorExercice(file1Path, wordSearch);
        ExecutorExercice executorFile2 = new ExecutorExercice(file2Path, wordSearch);
        ExecutorExercice executorFile3 = new ExecutorExercice(file3Path, wordSearch);
        ExecutorExercice executorFile4 = new ExecutorExercice(file4Path, wordSearch);
        ExecutorExercice executorFile5 = new ExecutorExercice(file5Path, wordSearch);

        executor.execute(executorFile1);
        executor.execute(executorFile2);
        executor.execute(executorFile3);
        executor.execute(executorFile4);
        executor.execute(executorFile5);

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);

        List<Integer> count = new ArrayList<>();
        count.add(executorFile1.getTotalWords() + executorFile2.getTotalWords() + executorFile3.getTotalWords() + executorFile4.getTotalWords() + executorFile5.getTotalWords());
        int total = count.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Total occurrences of " + wordSearch + " : " + total);
    }
}
