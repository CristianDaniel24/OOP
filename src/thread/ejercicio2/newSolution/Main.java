package thread.ejercicio2.newSolution;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(8);

        scheduled.scheduleAtFixedRate(new RunnableClass("A"), 0, 2, TimeUnit.SECONDS);

        scheduled.scheduleAtFixedRate(new RunnableClass("B"), 1, 2, TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            scheduled.shutdown();
            System.out.println("End -1 " + scheduled.isTerminated());
            try {
                boolean result = scheduled.awaitTermination(3, TimeUnit.SECONDS);
                System.out.println("End -2 " + result);
                scheduled.shutdownNow();
                System.out.println("End -3");
            } catch (InterruptedException e) {
                scheduled.shutdownNow();
                System.out.println("End -3");
            }
            System.out.println("Scheduled has been shut down");
        }));
    }
}
