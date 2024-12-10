package generics.exercices.exercice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack<String> customStack = new CustomStack<>();

        System.out.println("Enter the text:");
        String text = reader.readLine();
        customStack.push(text);

        System.out.println("\nPeek of the CustomStack");
        System.out.println(customStack.peek());

        System.out.println("\nPop of the CustomStack");
        var item = customStack.pop();
        System.out.println(item);

        System.out.println("\nIsEmpety of the CustomStack");
        System.out.println(customStack.isEmpty());
    }
}
