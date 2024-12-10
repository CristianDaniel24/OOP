package generics.exercices.exercice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack<Double> customStack = new CustomStack<>();

        System.out.println("Enter the amount for add:");
        int amount = Integer.parseInt(reader.readLine());
        int i = 0;
        while (amount > i) {
            System.out.println("Enter the number decimal:");
            Double number = Double.parseDouble(reader.readLine());
            customStack.push(number);
            i++;
        }
        System.out.println("\nPeek:");
        System.out.println(customStack.peek());
        System.out.println("\nPop:");
        System.out.println(customStack.pop());
        System.out.println("\nIsEmpty:");
        System.out.println(customStack.isEmpty());
    }
}
