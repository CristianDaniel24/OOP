package thread.pool.fixed;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un ThreadPool con dos hilos
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        // Crear una tarea para sumar del 1 al 5
        Runnable task1 = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
            }
            System.out.println("The sum of 1 a 5 is: " + sum);
        };

        // Crear una tarea para sumar del 6 al 10
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 6; i <= 10; i++) {
                sum += i;
            }
            System.out.println("The sum of 6 a 10 is: " + sum);
        };

        // Enviar las tareas al ThreadPool
        threadPool.execute(task1);
        threadPool.execute(task2);

        // Cerrar el ThreadPool cuando ya no se necesiten más tareas
        //Este les dice que terminen pero espera a que acaben las tareas que estan haciendo
        threadPool.shutdown();
        //Este si termina las tareas de golpe
        threadPool.shutdownNow();
    }
}
