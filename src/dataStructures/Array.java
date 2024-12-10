package dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //BUSQUEDA
        System.out.println("BUSQUEDA EN EL ARRAY");
        int[] numerosBusqueda = {3, 1, 4, 5, 2};

        int indice = 3;

        if (indice >= 0 && indice < numerosBusqueda.length) {
            System.out.println("El numero del indice " + indice + " es: " + numerosBusqueda[indice]);
        } else {
            System.out.println("El indice buscado esta fuera del array");
        }

        System.out.println("----------------------------");

        //ORDENACION
        System.out.println("ORDENACION EN EL ARRAY");
        int[] numerosOrdenacion = {2, 3, 1, 5, 4};

        System.out.println("Array normal: " + Arrays.toString(numerosOrdenacion));

        Arrays.sort(numerosOrdenacion);
        //12345
        System.out.println("Array ordenado: " + Arrays.toString(numerosOrdenacion));

        System.out.println("----------------------------");

        //INSERSION

        //LOS ARRAYS TIENE UN TAMAÑO FIJO DESPUES DE HABER SIDO CREADOS

        //ACTUALIZACION
        System.out.println("ACTUALIZACION EN EL ARRAY");
        int[] numerosActualizacion = {1, 2, 3, 4, 5};

        System.out.println("Array original: " + Arrays.toString(numerosActualizacion));

        numerosActualizacion[0] = 6;
        numerosActualizacion[2] = 7;
        numerosActualizacion[4] = 8;

        System.out.println("El Array actualizado es: " + Arrays.toString(numerosActualizacion));

        //ELIMINACION

        //LOS ARRAYS TIENE UN TAMAÑO FIJO, LA UNICA OPCION ES COPIAR EL ARRAY Y HACERLE LAS MODIFICACIONES NECESARIAS
    }
}