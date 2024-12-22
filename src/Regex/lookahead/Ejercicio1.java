package Regex.lookahead;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Usando un lookahead positivo buscar los numeros seguidos por una ',' sin incluir la ','
        String input = "12, 45, 30, 80";
        Pattern pattern = Pattern.compile("\\d+(?=,)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
