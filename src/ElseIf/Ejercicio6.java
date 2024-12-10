package ElseIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa la edad: ");
        int edad = Integer.parseInt(reader.readLine());

        if (edad <= 18) {
            System.out.println("Puedes entrar a la piscina");
        } else {
            System.out.println("No puedes entrar");
        }
    }
}
