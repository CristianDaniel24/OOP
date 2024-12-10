package thread.ejerciciosCompletos.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Start");
                System.out.println("2. Exit");
                System.out.println("Enter the number:");
                int option = Integer.parseInt(reader.readLine());
                if (option == 1) {
                    List<String> listFiles = List.of("Employee1.txt", "Employee2.txt", "Employee3.txt");
                    List<ThreadService> threadService = listFiles.stream().map(file -> new ThreadService(file)).toList();

                    ExecutorService executor = Executors.newFixedThreadPool(listFiles.size());

                    try {
                        threadService.forEach(executor::submit);
                        executor.shutdown();
                        boolean terminate = executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);

                        System.out.println("\nThe persons minors or equal of 25 years are:");
                        threadService.forEach(thread -> thread.getListMinors25().forEach(emplo -> {
                                    System.out.printf("Name: %s Rol: %s Age: %d%n", emplo.name(), emplo.rol(), emplo.edad());
                                })
                        );

                        System.out.println("\nThe persons elderly or equal of 30 years are:");
                        threadService.forEach(thread -> thread.getListElderly30().forEach(emplo -> {
                                    System.out.printf("Name: %s Rol: %s Age: %d%n", emplo.name(), emplo.rol(), emplo.edad());
                                })
                        );
                        if (!terminate) {
                            executor.shutdownNow();
                        }
                    } catch (InterruptedException e) {
                        executor.shutdownNow();
                        throw new RuntimeException(e);
                    }

                } else if (option == 2) {
                    System.out.println("Exit..");
                    exit = true;
                } else {
                    System.out.println("The option is incorrect");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please");
            }
        }
    }
}
