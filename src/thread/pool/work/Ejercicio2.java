package thread.pool.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un Work-Stealing Pool con 2 hilos
        ExecutorService workStealingPool = Executors.newWorkStealingPool(2);

        // Enviar 4 tareas al pool
        for (int i = 1; i <= 4; i++) {
            int taskNumber = i;
            workStealingPool.submit(() -> {
                System.out.println("Tarea: " + taskNumber + " iniciada por: " + Thread.currentThread().getName());

                try {
                    // Simulamos que las tareas tardan diferente tiempo en completarse
                    Thread.sleep(1000 * taskNumber);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Tarea: " + taskNumber + " completada por: " + Thread.currentThread().getName());
            });
        }

        // Cerrar el pool después de enviar todas las tareas
        workStealingPool.shutdown();

        try {
            // Esperar a que todas las tareas terminen
            workStealingPool.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            workStealingPool.shutdownNow();
        }
    }
}
