package TryCatch;

import java.io.*;

public class Exception6 {
    public static void main(String[] args) throws IOException {

        String archive = "C:\\Users\\crist\\Documents\\IntelliJ\\OOP\\src\\TryCatch\\lectura.txt";
        try {
            File archivo = new File(archive);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            // Leer el archivo línea por línea
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read the file");
        }
    }
}
