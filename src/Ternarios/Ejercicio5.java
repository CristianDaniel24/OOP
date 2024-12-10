package Ternarios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = -3;

        String result = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El numero es: " + result);
    }
}
