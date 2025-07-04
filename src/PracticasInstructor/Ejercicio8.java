package PracticasInstructor;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {

        List<Object[]> listaTuplas = new ArrayList<>();

        listaTuplas.add(new Object[]{"A", 4});
        listaTuplas.add(new Object[]{"E", 7});
        listaTuplas.add(new Object[]{"I", 3});

        System.out.println("La cantidad de elementos de la tupla es: " + listaTuplas.size());
    }
}
