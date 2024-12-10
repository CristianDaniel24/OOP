package thread.pool.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un Scheduled Thread Pool con 2 hilos
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Crear una tarea que se ejecute cada 2 segundos
        Runnable task = () -> {
            System.out.println("Tarea ejecutada por " + Thread.currentThread().getName() + " a las " + System.currentTimeMillis());
        };

        // Programar la tarea para que se ejecute cada 2 segundos con un retraso inicial de 1 segundo
        scheduler.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);

        // Esperar 10 segundos y luego apagar el scheduler
        try {
            Thread.sleep(10000); // Espera para observar la ejecución de la tarea
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Apagar el scheduler después de 10 segundos
        scheduler.shutdown();
        System.out.println("Scheduler apagado");
    }
}
