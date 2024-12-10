package stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEjemplo {
    public static void main(String[] args) {
        Queue<String> name = new LinkedList<>();
        // Añadir elementos a la cola
        name.add("Elemento 1");
        name.add("Elemento 2");
        name.add("Elemento 3");

        // Mostrar la cola
        System.out.println("Cola: " + name);

        // Eliminar elementos de la cola
        String primerElemento = name.poll(); // Elimina y retorna el primer elemento
        System.out.println("Elemento eliminado: " + primerElemento);

        // Mostrar la cola después de eliminar un elemento
        System.out.println("Cola después de eliminar un elemento: " + name);

        // Ver el primer elemento sin eliminarlo
        String siguienteElemento = name.peek(); // Retorna el primer elemento sin eliminarlo
        System.out.println("Siguiente elemento en la cola: " + siguienteElemento);
    }
}
