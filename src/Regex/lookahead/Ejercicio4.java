package Regex.lookahead;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Usando un lookahead negativo encontrar las palabras que no estan seguidas por un espacio en blanco
        String input = "50% 30 100% 200";
        Pattern pattern = Pattern.compile("\\d+(?!%)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
