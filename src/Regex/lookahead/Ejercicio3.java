package Regex.lookahead;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Usando un lookahead positivo encontrar las palabras que terminan en 'e' y son seguidas por un '.'
        String input = "apple. banana. orange. blackberry.";
        Pattern pattern = Pattern.compile("\\b\\w+e(?=\\.)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
