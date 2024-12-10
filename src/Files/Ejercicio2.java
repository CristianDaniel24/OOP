package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\crist\\Documents\\IntelliJ\\OOP\\src\\Files\\lectura2.txt";  // Reemplaza con la ruta de tu archivo

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            int countingWords = 0;

            while ((line = reader.readLine()) != null) {
                // Se divide la linea en palabras usando los espacios y los saltos de línea
                String[] words = line.split("\\s+");
                countingWords += words.length;
            }

            System.out.println("The file has " + countingWords + " words");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
