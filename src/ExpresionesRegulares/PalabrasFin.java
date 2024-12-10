package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabrasFin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        System.out.println("Enter the ending letter:");
        char letter = scanner.nextLine().toLowerCase().charAt(0);

        Pattern pattern = Pattern.compile("\\b\\w*" + letter + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Imprimir las palabras encontradas
        System.out.println("Words that find with '" + letter + " are:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
