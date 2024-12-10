package Regex;

public class Grupos1 {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        String text = "1hola hola1";

        boolean isMatch = text.matches(regex);

        System.out.println("¿La palabra se repite varias veces? " + isMatch);
    }
}
