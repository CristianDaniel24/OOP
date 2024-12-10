package thread.ejercicio2;

import java.time.LocalTime;

public class RunnableClass implements Runnable {

    public RunnableClass() {
    }

    @Override
    public void run() {
        LocalTime timeCurrent = LocalTime.now();
        System.out.printf("The current hour is: %02d:%02d:%02d%n", timeCurrent.getHour(), timeCurrent.getMinute(), timeCurrent.getSecond());
    }
}
