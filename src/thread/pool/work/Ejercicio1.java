package thread.pool.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un Work Stealing Pool con un número de hilos basado en los procesadores disponibles
        ExecutorService executor = Executors.newWorkStealingPool();

        // Crear y enviar 5 tareas con diferentes tiempos de espera
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Tarea " + taskId + " ejecutada por " + Thread.currentThread().getName());
                try {
                    // Simular tiempo de trabajo
                    TimeUnit.SECONDS.sleep(taskId);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Tarea " + taskId + " ha terminado");
            });
        }

        // Cerrar el Executor Service
        executor.shutdown();

        // Esperar hasta que todas las tareas se completen
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Todas las tareas han finalizado");
    }
}
