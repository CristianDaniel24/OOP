package generics;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Encontrar el minimo entre dos numeros enteros
        int menorEntero = minimo(10, 20);
        System.out.println("\nEl entero menor es: " + menorEntero); //10
        // Encontrar el minimo entre dos cadenas
        String menorCadena = minimo("Hola", "Mundo");
        System.out.println("\nLa cadena menor es: " + menorCadena); //Hola
        // Encontrar el minimo entre dos numeros decimales
        Double menorDecimal = minimo(5.5, 3.3);
        System.out.println("\nEl decimal menor es: " + menorDecimal); //3.3
    }

    // Metodo generico que devuelve el minimo de dos elementos comparables
    public static <T extends Comparable<T>> T minimo(T a, T b) {
        return (a.compareTo(b) < 0) ? a : b;
    }
}
