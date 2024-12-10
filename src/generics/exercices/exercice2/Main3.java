package generics.exercices.exercice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack<Integer> customStack = new CustomStack<>();
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu Stack");
                System.out.println("1. Push");
                System.out.println("2. Peek");
                System.out.println("3. Pop");
                System.out.println("4. IsEmpty");
                System.out.println("5. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        System.out.println("\nEnter the number:");
                        int number = Integer.parseInt(reader.readLine());
                        customStack.push(number);
                        break;
                    case 2:
                        if (customStack.isEmpty()) {
                            System.out.println("The Stack is empty");
                        } else {
                            System.out.println("\nPeek:");
                            System.out.println(customStack.peek());
                        }
                        break;
                    case 3:
                        if (customStack.isEmpty()) {
                            System.out.println("The Stack is empty");
                        } else {
                            System.out.println("\nPop:");
                            System.out.println(customStack.pop());
                        }
                        break;
                    case 4:
                        System.out.println("\nIsEmpty:");
                        System.out.println(customStack.isEmpty());
                        break;
                    case 5:
                        System.out.println("Exit..");
                        exit = true;
                        break;
                    default:
                        System.out.println("\nThe option is invalid");
                }

            } catch (NumberFormatException e) {
                System.out.println("\nEnter the number, please");
            }
        }
    }
}
