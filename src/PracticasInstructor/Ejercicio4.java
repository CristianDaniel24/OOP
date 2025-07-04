package PracticasInstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa una palabra: ");
        String palabra = reader.readLine();

        if (palindromo(palabra)) {
            System.out.println("La palabra es un palindromo");
        } else {
            System.out.println("La palabra no es un palindromo");
        }
    }

    public static boolean palindromo(String palabra) {
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equalsIgnoreCase(palabraInvertida);
    }
}
