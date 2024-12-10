package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1Archivo {

    public static void modificarArchivo(String rutaArchivo) {
        List<String> textoFinal = new ArrayList<>();

        // Se lee el archivo y se modifican las líneas
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // Modificar la línea aquí (por ejemplo, agregar un texto al final)
                linea = linea + System.lineSeparator() + "Linea Modificada";
                textoFinal.add(linea);
            }
        } catch (IOException e) {
            System.out.println("\nAn error occurred while reading the file: " + e.getMessage());
        }

        // Sobrescribir el archivo con el contenido modificado
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (String linea : textoFinal) {
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
            }
            System.out.println("\nThe file has been modified successfully");
        } catch (IOException e) {
            System.out.println("\nAn error occurred while writing to the file: " + e.getMessage());
        }
    }
}
