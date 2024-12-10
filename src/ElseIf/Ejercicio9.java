package ElseIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el promedio del estudiante:");
        double promedio = Double.parseDouble(reader.readLine());

        if (promedio >= 0 && promedio <= 3) {
            System.out.println("El estudiante reprobo");
        } else if (promedio >= 3 && promedio <= 5) {
            System.out.println("El estudiante necesita mejorar");
        } else if (promedio >= 5 && promedio <= 8) {
            System.out.println("El estudiante aprobo");
        } else if (promedio >= 8 && promedio <= 10) {
            System.out.println("El estudiante recibira un cuadro de honor");
        } else {
            System.out.println("La nota es invalida");
        }
    }
}
