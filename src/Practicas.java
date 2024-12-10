import java.util.Stack;

public class Practicas {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        // Apilar elementos en la pila
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nPila: " + stack);

        // Ver el elemento superior con peek()
        stack.peek();
        System.out.println("\nElemento en la cima (con peek): ");

        // Verificar que el elemento aún está en la pila
        System.out.println("\nPila después de peek: " + stack);

        // Usar pop para quitar el elemento superior
        stack.pop();
        System.out.println("\nPila después de pop: " + stack);

        // Intentar peek cuando la pila no está vacía
        if (!stack.isEmpty()) {
            System.out.println("\nElemento en la cima después de pop (con peek): " + stack.peek());
        }
    }
}
