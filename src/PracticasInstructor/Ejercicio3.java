package PracticasInstructor;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<List<Integer>> listaAnidada = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5)
        );

        int sumaTotal = sumaTotal(listaAnidada);
        System.out.println("La suma total es: " + sumaTotal);
    }

    public static int sumaTotal(List<List<Integer>> listaAnidada) {
        int sumaTotal = 0;
        for (List<Integer> sublista : listaAnidada) {
            for (Integer numero : sublista) {
                sumaTotal += numero;
            }
        }
        return sumaTotal;
    }
}
