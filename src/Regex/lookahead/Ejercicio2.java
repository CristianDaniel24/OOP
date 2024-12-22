package Regex.lookahead;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Usando un lookahead positivo se encuentran unicamente las palabras que son seguidas por un espacio
        String input = "orange apple banana";
        Pattern pattern = Pattern.compile("\\w+(?=\\s)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
