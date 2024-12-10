package JavaDocs;

/**
 * La clase Ejercicio1 proporciona un metodo para sumar dos numeros enteros
 */
public class Ejercicio1 {
    /**
     * El metodo principal donde se ejecutara el programa
     *
     * @param args Argumentos de linea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Ejercicio1 sum = new Ejercicio1();
        int resul = sum.sum(5, 2);
        System.out.println("La suma entre 5 y 2 es: " + resul);
    }

    /**
     * Suma dos numeros enteros y devuelve el un resultado
     *
     * @param num1 El primer numero a sumar
     * @param num2 El segundo numero a sumar
     * @return La suma de num1 y num2
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
