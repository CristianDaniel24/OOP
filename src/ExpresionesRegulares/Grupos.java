package ExpresionesRegulares;

import java.util.Scanner;

public class Grupos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(ab)+";

        if (text.matches(regex)) {
            System.out.println("The " + text + " is valid");
        } else {
            System.out.println("The " + text + " it's not valid");
        }
    }
}
