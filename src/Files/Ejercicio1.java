package Files;

import static Files.Ejercicio1Archivo.modificarArchivo;

public class Ejercicio1 {
    public static void main(String[] args) {
        String rutaFile = "C:\\Users\\crist\\Documents\\IntelliJ\\OOP\\src\\Files\\lectura.txt";

        // Modificar el archivo directamente
        modificarArchivo(rutaFile);
    }
}
