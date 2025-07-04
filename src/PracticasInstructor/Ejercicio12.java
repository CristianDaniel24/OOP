package PracticasInstructor;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(7);
        numeros.add(2);
        numeros.add(4);
        numeros.add(9);
        numeros.add(5);

        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println("La lista de los numeros es: " + numeros);
        System.out.println("La cantidad de numeros pares es: " + contador);
    }
}
