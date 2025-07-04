package PracticasInstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nIngresa un numero entre 1 y 3999: ");
                int numero = Integer.parseInt(reader.readLine());

                if (numero < 1 || numero > 3999) {
                    exit = true;
                }

                String romano = convertirRomano(numero);
                System.out.println("EL numero que ingresaste en romano es:");
                System.out.println(romano);
            } catch (NumberFormatException e) {
                System.out.println("Porfavor ingresa un numero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El numero esta fuera de rango");
            }
        }
    }

    public static String convertirRomano(int numero) {

        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] miles = {"", "M", "MM", "MMM"};

        return miles[numero / 1000] +
                centenas[(numero % 1000) / 100] +
                decenas[(numero % 100) / 10] +
                unidades[numero % 10];
    }
}
