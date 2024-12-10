package generics.exercices.exercice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Sum");
                System.out.println("2. Rest");
                System.out.println("3. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        System.out.println("\nEnter the number 1:");
                        int numberSum1 = Integer.parseInt(reader.readLine());
                        System.out.println("Enter the number 2:");
                        int numberSum2 = Integer.parseInt(reader.readLine());

                        NumberBox<Number> numberBoxSum = new NumberBox<>(numberSum1, numberSum2);
                        System.out.printf("Result sum: %.2f", numberBoxSum.add().doubleValue());
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("\nEnter the number 1:");
                        Double numberIntRest1 = Double.parseDouble(reader.readLine());
                        System.out.println("Enter the number 2:");
                        Double numberIntRest2 = Double.parseDouble(reader.readLine());

                        NumberBox<Number> numberBoxIntegerSum = new NumberBox<>(numberIntRest1, numberIntRest2);
                        System.out.printf("Result rest: %.2f", numberBoxIntegerSum.substract());
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Exit..");
                        exit = true;
                        break;
                    default:
                        System.out.println("The option is invalid");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEnter the number, please");
            }
        }
    }
}
