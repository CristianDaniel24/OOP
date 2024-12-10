package Regex;

public class Grupos2 {
    public static void main(String[] args) {
        String regex = "(\\d{1,3})\\.\\1\\.\\1\\.\\1";
        String ip = "192.162.192.122";

        boolean isMatch = ip.matches(regex);
        System.out.println("¿La IP es válida? " + isMatch);
    }
}
