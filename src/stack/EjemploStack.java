package stack;

import java.util.Stack;

public class EjemploStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        // Asi se agregan elementos a un Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Mostrar el stack
        System.out.println("The Stack is: " + stack);

        // Obtener un elemento en la parte superior sin eliminarla
        int top = stack.peek();
        System.out.println("Top element the stack: " + top);

        // Eliminar un elemento en la parte superior
        int removedElement = stack.pop();
        System.out.println("Removed element the stack: " + removedElement);

        // Mostrar el contenido del stack despues de la eliminacion
        System.out.println("Stack after pop the stack: " + stack);

        // Verificar si el stack está vacio
        boolean isEmpty = stack.isEmpty();
        System.out.println("The stack is empty? " + isEmpty);

        // Obtener el tamaño del stack
        int size = stack.size();
        System.out.println("Size of stack: " + size);
        /*
        for (int i = 0; i <= stack.size(); i++) {
            System.out.println("The stack removed is: " + stack.pop());
        }
         */
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
