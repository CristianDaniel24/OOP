package thread.ejerciciosCompletos.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> namesList = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Enter the names");
                System.out.println("2. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                if (option == 1) {
                    try {
                        System.out.println("Enter the amount the names:");
                        int amountNames = Integer.parseInt(reader.readLine());
                        int i = 0;
                        while (i < amountNames) {
                            System.out.println("Enter the name:");
                            String name = reader.readLine();
                            namesList.add(name);
                            i++;
                        }
                        ThreadClassEjercicio1 threadClass = new ThreadClassEjercicio1(namesList);
                        threadClass.start();
                        threadClass.join();
                        threadClass.getNamesFinal().forEach(n -> System.out.println("Name: " + n));
                    } catch (InterruptedException e) {
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
