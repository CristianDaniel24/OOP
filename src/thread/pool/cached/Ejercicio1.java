package thread.pool.cached;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Crear un Cached Thread Pool
        ExecutorService executor = Executors.newCachedThreadPool();

        //Enviar 3 tareas al Thread Pool
        for (int i = 1; i <= 10; i++) {
            //Se usa final para asegurarse de que taskId no cambie durante la ejecución de la tarea
            final int taskId = i; //Identificador de la tarea
            executor.submit(() -> {
                System.out.println("Tarea: " + taskId + " ejecutada por " + Thread.currentThread().getName());
            });
        }
        executor.shutdownNow();
    }
}
