package ElseIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el precio del producto: ");
        double precio = Double.parseDouble(reader.readLine());

        if (precio < 50) {
            System.out.println("El producto es barato");
        } else if (precio <= 100) {
            System.out.println("El producto es de precio estandar");
        } else {
            System.out.println("El producto es premium");
        }
    }
}
