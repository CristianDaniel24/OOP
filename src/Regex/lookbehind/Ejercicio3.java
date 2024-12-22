package Regex.lookbehind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Usando un lookbehind positivo busca los digitos despues de la palabra 'ID'
        String input = "ID 12345 ID 67890 ID 11223 34262";
        Pattern pattern = Pattern.compile("(?<=ID )\\d+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
