package stack;

import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {

        String texto = "(((Hola)))";

        boolean retorno = isBalanced(texto);
        System.out.println(retorno);
        //System.out.println(caracteres.length);
    }

    public static boolean isBalanced(String texto) {
        Stack<Character> parentesis = new Stack<>();

        char[] caracteres = texto.toCharArray();

        for (char caracter : caracteres) {
            if (caracter == '(') {
                parentesis.push(caracter);
            } else if (caracter == ')') {
                if (parentesis.isEmpty() || parentesis.pop() != '(') {
                    return false;
                }
            }
            System.out.println(caracter);
        }
        return parentesis.isEmpty();
    }
}
