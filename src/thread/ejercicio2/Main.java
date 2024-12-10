package thread.ejercicio2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(2);

        RunnableClass runnable = new RunnableClass();
        int amount = 0;
        while (amount < 5) {
            scheduled.schedule(runnable, 2, TimeUnit.SECONDS);
            amount++;
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduled.shutdown();
    }
}
