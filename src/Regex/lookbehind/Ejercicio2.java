package Regex.lookbehind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Usando un lookbehind positivo busca las palabras despues de un espacio y una palabra especifica
        String input = "apple banana apple orange blackberry";
        Pattern pattern = Pattern.compile("(?<=apple )\\w+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
