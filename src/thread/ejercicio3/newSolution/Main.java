package thread.ejercicio3.newSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word to search");
        String word = reader.readLine();

        List<String> files = List.of("File1.txt", "File2.txt", "File3.txt", "File4.txt", "File5.txt");
        List<FileReader> fileReaders = files.stream().map(file -> new FileReader(file, word)).toList();

        ExecutorService executorService = Executors.newFixedThreadPool(files.size());
        try {
            fileReaders.forEach(executorService::submit);
            executorService.shutdown();
            boolean termination = executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

            Long occurrences = fileReaders.stream()
                    .filter(fileReader -> fileReader.getCount() > 0)
                    .peek(System.out::println)
                    .collect(Collectors.summarizingLong(FileReader::getCount)).getSum();

            System.out.printf("Total occurrences of '%s' : %d", word, occurrences);

            if (!termination) {
                executorService.shutdownNow();
            }
        } catch (Exception e) {
            executorService.shutdownNow();
            throw new RuntimeException(e);
        }
    }
}
