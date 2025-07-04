package PracticasInstructor;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {

        List<Integer> listaNumeros = new LinkedList<>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);

        System.out.println("Lista de numeros original: " + listaNumeros);

        List<Integer> listaInvertida = listaInvertida(listaNumeros);
        System.out.println("Lista de numeros invertida: " + listaInvertida);
    }

    public static List<Integer> listaInvertida(List<Integer> listaNumeros) {
        List<Integer> listaInvertida = new LinkedList<>();

        for (int i = listaNumeros.size() - 1; i >= 0; i--) {
            listaInvertida.add(listaNumeros.get(i));
        }
        return listaInvertida;
    }
}
