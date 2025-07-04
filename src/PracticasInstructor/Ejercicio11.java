package PracticasInstructor;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio11 {
    public static void main(String[] args) {
        List<Integer> numerosLista = new LinkedList<>();

        numerosLista.add(5);
        numerosLista.add(1);
        numerosLista.add(4);
        numerosLista.add(7);
        numerosLista.add(2);

        int numeroMayor = Collections.max(numerosLista);
        int numeroMenor = Collections.min(numerosLista);

        System.out.println("La lista de numeros es: " + numerosLista);
        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);
    }
}
