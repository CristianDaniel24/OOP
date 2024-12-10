package stack;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        String resultado = stackTexto(texto);
        System.out.println("\nThe input text is:");
        System.out.println(texto);
        System.out.println("\nThe output text is");
        System.out.println(resultado);
    }

    public static String stackTexto(String texto) {
        Stack<Character> pilaTexto = new Stack<>();
        char[] arrayTexto = texto.toCharArray();

        // Empujar cada carácter de la cadena a la stack
        for (char t : arrayTexto) {
            pilaTexto.push(t);
        }

        // Crear un StringBuilder para crear el texto invertido
        StringBuilder textoInvertido = new StringBuilder();

        // Extraer los caracteres de la stack y agregarlos a la cadena invertida
        while (!pilaTexto.isEmpty()) {
            textoInvertido.append(pilaTexto.pop());
        }

        // Convertir el StringBuilder a String y devolverlo
        return textoInvertido.toString();
    }
}