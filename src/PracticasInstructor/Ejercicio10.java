package PracticasInstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la cantidad de numeros para generar la secuencia Fibonacci");
        int numero = Integer.parseInt(reader.readLine());

        System.out.println("\nLa secuencia Fibonacci es:");
        secuenciaFibonacci(numero);
    }

    public static void secuenciaFibonacci(int numero) {
        int a = 0;
        int b = 1;
        int contador = 0;

        while (contador < numero) {
            System.out.print(a + " ");

            int siguienteNumero = a + b;
            a = b;
            b = siguienteNumero;
            contador++;
        }
    }
}
