package Arrays;

public class Array {
    public static void main(String[] args) {
        // Declaración del array
        int[] numeros = {1, 2, 3, 4, 5};
        //Para copiar o clonar el Array
        int[] numerosCopia = numeros.clone();
        System.out.println("CLONAR ARRAY");
        System.out.println("Array original: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray clonado: ");
        for (int i : numerosCopia) {
            System.out.print(i + " ");
        }

        // Acceso a elementos
        System.out.println("\nACCESO A ELEMENTOS");
        System.out.println("El primer elemento es: " + numeros[0]);

        // Longitud del array
        System.out.println("LONGITUD DEL ARRAY");
        System.out.println("La longitud del array es: " + numeros.length);

        // Recorrer el array con un for
        System.out.println("RECORRER EL ARRAY CON UN FOR");
        System.out.println("Recorriendo el array con un bucle for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " + numeros[i]);
        }

        // Recorrer el array con un for each
        System.out.println("RECORRER EL ARRAY CON UN FOR EACH");
        System.out.println("Recorriendo el array con un bucle for each:");
        for (int num : numeros) {
            System.out.println("Elemento: " + num);
        }
}
}