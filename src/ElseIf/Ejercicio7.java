package ElseIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa un número: ");
        int numero = Integer.parseInt(reader.readLine());

        if (numero > 100) {
            System.out.println("El numero es mayor que 100");
        } else if (numero == 100) {
            System.out.println("El numero es igual a 100");
        } else {
            System.out.println("El numero es menor que 100");
        }
    }
}
