package Streams.ForEach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu!!");
                System.out.println("1. Enter the text");
                System.out.println("2. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        text(reader);
                        break;
                    case 2:
                        System.out.println("Bye..");
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

    public static void text(BufferedReader reader) throws IOException {
        System.out.println("Enter the text:");
        String text = reader.readLine();

        String[] textSplit = text.split(" ");

        List<String> textInput = Arrays.asList(textSplit);

        List<Integer> textResult = textInput.stream()
                .map(String::length)
                .toList();
        System.out.println("\nThe length of the words are:");
        textResult.forEach(System.out::println);
    }
}
