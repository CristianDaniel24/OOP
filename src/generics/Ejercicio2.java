package generics;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Intercambiar en un array de Integer
        Integer[] numbers = {1, 2, 3, 4, 5};
        intercambio(numbers, 0, 4);
        System.out.println("Array despues del intercambio: " + Arrays.toString(numbers)); // [5, 2, 3, 4, 1]

        // Intercambiar en un array de String
        String[] words = {"Hola", "Mundo", "Java"};
        intercambio(words, 1, 2);
        System.out.println("\nArray despues del intercambio: " + Arrays.toString(words)); // [Hola, Mundo, Java]

    }

    public static <T> void intercambio(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
