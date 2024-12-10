package generics.exercices.exercice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack<String> customStack = new CustomStack<>();
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nWelcome to Menu!!");
                System.out.println("1. Push item");
                System.out.println("2. Pop item");
                System.out.println("3. Peek item");
                System.out.println("4. IsEmpty");
                System.out.println("5. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        System.out.println("\nEnter amount of items for add:");
                        int stackItems = Integer.parseInt(reader.readLine());
                        int i = 0;
                        while (i < stackItems) {
                            System.out.println("\nSelect type of date:");
                            System.out.println("1. String");
                            System.out.println("2. Integer");
                            System.out.println("3. Double");
                            System.out.println("Enter the option:");
                            int optionType = Integer.parseInt(reader.readLine());

                            switch (optionType) {
                                case 1:
                                    System.out.println("\nEnter the item for push:");
                                    String itemString = reader.readLine();
                                    customStack.push(itemString);
                                    break;
                                case 2:
                                    System.out.println("\nEnter the item for push:");
                                    String itemInteger = reader.readLine();
                                    customStack.push(itemInteger);
                                    break;
                                case 3:
                                    System.out.println("\nEnter the item for push:");
                                    String itemDouble = reader.readLine();
                                    customStack.push(itemDouble);
                                    break;
                                default:
                                    System.out.println("\nEnter the option valid");
                            }
                            i++;
                        }
                        break;
                    case 2:
                        customStack.pop();
                        var itemPop = customStack.pop();
                        System.out.println(itemPop);
                        break;
                    case 3:
                        var itemPeek = customStack.peek();
                        System.out.println(itemPeek);
                        break;
                    case 4:
                        boolean empty = customStack.isEmpty();
                        System.out.println(empty);
                        break;
                    case 5:
                        System.out.println("Exit..");
                        exit = true;
                        break;
                    default:
                        System.out.println("\nEnter the option valid");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEnter the number, please");
            } catch (EmptyStackException e) {
                System.out.println("\nThe Stack is empty =(");
            }
        }
    }
}
