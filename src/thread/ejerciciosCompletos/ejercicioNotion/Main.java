package thread.ejerciciosCompletos.ejercicioNotion;

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
                    List<String> files = List.of("Numbers1.txt", "Numbers2.txt", "Numbers3.txt", "Numbers4.txt", "Numbers5.txt");
                    List<ThreadService> threadService = files.stream().map(file -> new ThreadService(file)).toList();

                    ExecutorService executor = Executors.newFixedThreadPool(files.size());

                    try {
                        threadService.forEach(executor::submit);
                        executor.shutdown();
                        boolean termination = executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);

                        System.out.println("PART 1:");
                        threadService.forEach(thread -> System.out.printf("The line: %d of the file: %s has the sum more big of: %d%n"
                                , thread.getSumCuadrados().getKey(), thread.getNameFile(), thread.getSumCuadrados().getValue()));
                        System.out.println("\nPART 2:");
                        threadService.forEach(thread -> System.out.printf("The sum total of the file %s is: %d%n", thread.getNameFile(), thread.getSumTotalCuadrados()));

                        Long total = threadService.stream()
                                .mapToLong(ThreadService::getSumTotalCuadrados)
                                .sum();
                        System.out.printf("%nThe sum total of all Threads is: %d%n", total);

                        if (!termination) {
                            executor.shutdown();
                        }
                    } catch (Exception e) {
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
                System.out.println("Enter the number, please");
            }
        }
    }
}
