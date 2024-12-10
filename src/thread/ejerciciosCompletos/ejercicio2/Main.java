package thread.ejerciciosCompletos.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        while (!exit) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Enter the numbers");
                System.out.println("2. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                if (option == 1) {
                    List<Integer> list1 = new ArrayList<>();
                    System.out.println("Enter the amount of list 1:");
                    int amount1 = Integer.parseInt(reader.readLine());
                    for (int i = 0; i < amount1; i++) {
                        System.out.println("\nEnter the number:");
                        int number1 = Integer.parseInt(reader.readLine());
                        list1.add(number1);
                    }
                    ThreadClassEjercicio2 threadClassEjercicio21 = new ThreadClassEjercicio2(list1);

                    List<Integer> list2 = new ArrayList<>();
                    System.out.println("Enter the amount of list 2:");
                    int amount2 = Integer.parseInt(reader.readLine());
                    for (int i = 0; i < amount2; i++) {
                        System.out.println("\nEnter the number:");
                        int number2 = Integer.parseInt(reader.readLine());
                        list2.add(number2);
                    }
                    ThreadClassEjercicio2 threadClassEjercicio22 = new ThreadClassEjercicio2(list2);
                    executorService.execute(threadClassEjercicio21);
                    executorService.execute(threadClassEjercicio22);
                    executorService.shutdown();
                    boolean termination = executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
                    threadClassEjercicio21.print();
                    threadClassEjercicio22.print();

                    if (!termination) {
                        executorService.shutdownNow();
                    }
                } else if (option == 2) {
                    System.out.println("Exit..");
                    exit = true;
                } else {
                    System.out.println("Enter the option valid");
                }
            } catch (NumberFormatException | InterruptedException e) {
                executorService.shutdownNow();
                System.out.println("\nError");
            }
        }
    }
}
