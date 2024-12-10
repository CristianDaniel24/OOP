package thread.pool.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un Single Thread Executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Enviar 5 tareas al Thread Pool
        for (int i = 1; i <= 5; i++) {
            final int taskId = i; // Identificador de la tarea
            executor.submit(() -> {
                System.out.println("Tarea " + taskId + " ejecutada por " + Thread.currentThread().getName());
                try {
                    // Simular trabajo con un retraso
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Tarea " + taskId + " fue interrumpida.");
                }
                System.out.println("Tarea " + taskId + " ha terminado.");
            });
        }
        // Cerrar el Thread Pool
        System.out.println(Thread.currentThread().getName());
        executor.shutdown();
    }
}
