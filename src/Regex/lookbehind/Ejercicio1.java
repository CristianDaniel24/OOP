package Regex.lookbehind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Usando un lookbehind positivo busca las palabras depues del '@'
        String input = "carlos@gmail.com daniel@gmail.com";
        Pattern pattern = Pattern.compile("(?<=@)\\w+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
