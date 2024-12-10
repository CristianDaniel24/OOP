package thread.ejercicio3.newSolution;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader extends Thread {
    private static final String PATH = "src/thread/ejercicio3/newSolution/";
    private final String fileName;
    private final String word;
    private Long count;

    public FileReader(String fileName, String word) {
        this.fileName = fileName;
        this.word = word;
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(Path.of(PATH.concat(fileName)));
            this.count = lines.stream()
                    .filter(line -> !line.isBlank())
                    .filter(line -> lines.contains(this.word))
                    .count();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getWord() {
        return word;
    }

    public Long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("Found '%s' in '%s' %d times", this.word, this.fileName, this.count);
    }
}
