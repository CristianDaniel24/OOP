package thread.ejercicio2.newSolution;

import java.time.LocalDateTime;

public class RunnableClass implements Runnable {
    final private String id;

    public RunnableClass(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.printf("id: %s, date: %s%n", this.id, LocalDateTime.now());
    }
}
