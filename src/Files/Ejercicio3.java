package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\crist\\Docuents\\IntelliJ\\OOP\\src\\Files\\lectura3.txt";

        String palabraBuscada = "program";

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            int numeroLinea = 0;
            boolean encontrado = false;

            while ((line = reader.readLine()) != null) {
                numeroLinea++;
                // Comprobar si la palabra esta
                if (line.contains(palabraBuscada)) {
                    System.out.println("The word: " + palabraBuscada + "is on the line: " + numeroLinea);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("The word: " + palabraBuscada + " was not found");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file " + e.getMessage());
        }
    }
}
