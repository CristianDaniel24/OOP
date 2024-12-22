package Regex.lookbehind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Usando un lookbehind negativo se encuentran las palabras que no estan seguidas por la palabra 'apple'
        String input = "apple orange apple banana";
        Pattern pattern = Pattern.compile("\\b\\w+(?<!apple)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
