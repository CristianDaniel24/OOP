package thread.ejerciciosCompletos.ejercicio4;

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
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                if (option == 1) {
                    List<String> files = List.of("Student1.txt", "Student2.txt", "Student3.txt");
                    List<ThreadService> threadService = files.stream().map(file -> new ThreadService(file)).toList();

                    ExecutorService executor = Executors.newFixedThreadPool(files.size());

                    try {
                        threadService.forEach(executor::submit);
                        executor.shutdown();
                        boolean termination = executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);

                        System.out.println("\nThe average of the students are:");
                        threadService.forEach(thread -> thread.getStudent().forEach(student -> {
                            System.out.printf("Name: %s Grade: %s Average: %.2f%n", student.getName(), student.getGrado(), student.getPromedio());
                        }));
                        if (!termination) {
                            executor.shutdown();
                        }
                    } catch (InterruptedException e) {
                        executor.shutdownNow();
                        throw new RuntimeException(e);
                    }
                } else if (option == 2) {
                    System.out.println("Exit..");
                    exit = true;
                } else {
                    System.out.println("The option is invalid");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number please");
            }
        }
    }
}
