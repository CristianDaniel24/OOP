package PracticasInstructor;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio9 {
    public static void main(String[] args) {

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        conjunto1.add(5);
        conjunto1.add(6);
        conjunto1.add(7);
        conjunto1.add(8);

        conjunto2.add(1);
        conjunto2.add(6);
        conjunto2.add(3);
        conjunto2.add(8);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("\nConjunto 2: " + conjunto2);

        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        System.out.println("\nInterseccion de los conjuntos: " + interseccion);
    }
}
