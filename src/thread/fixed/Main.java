package thread.fixed;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExerciceFixed fixed = new ExerciceFixed();

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        int count = 0;
        while (count < 8) {
            threadPool.execute(fixed);
            count++;
        }
        threadPool.shutdown();
    }
}
