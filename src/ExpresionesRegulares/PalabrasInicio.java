package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabrasInicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        System.out.println("Enter the letter:");
        char letter = scanner.nextLine().toLowerCase().charAt(0);

        // Crear el pattern
        Pattern pattern = Pattern.compile("\\b" + letter + "\\w*\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Words that start with " + letter + " are:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
