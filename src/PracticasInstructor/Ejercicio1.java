package PracticasInstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa un cadena de texto");
        String textoInput = reader.readLine();
        int contador = contarVocales(textoInput);
        System.out.printf("%nLa cantidad de vocales del texto son: %d", contador);
    }

    public static int contarVocales(String textoInput) {
        int contador = 0;
        String text = textoInput.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u':
                    contador++;
                    break;
            }
        }
        return contador;
    }
}
