package generics.exercices.exercice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> linkedList = new LinkedList<>();
        CustomStack<LinkedList<String>> customStack = new CustomStack<>();

        System.out.println("Enter the text:");
        String text = reader.readLine();
        linkedList.add(text);
        customStack.push(linkedList);

        System.out.println("\nPeek of the LinketList:");
        System.out.println(customStack.peek());

        System.out.println("\nPop of the LinketList:");
        System.out.println(customStack.pop());

        System.out.println("\nLinletList is empty??");
        System.out.println(customStack.isEmpty());
    }
}
