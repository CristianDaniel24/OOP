package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ejercicio4 {
    public static void main(String[] args) {

        HashMap<String, Integer> resultados = new HashMap<>();
        resultados.put("ERROR", 0);
        resultados.put("WARNING", 0);
        resultados.put("INFO", 0);

        String registros = "C:\\Users\\crist\\Docuents\\IntelliJ\\OOP\\src\\Files\\lectura3.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(registros))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    resultados.put("ERROR", resultados.get("ERROR") + 1);
                }
                if (line.contains("WARNING")) {
                    resultados.put("WARNING", resultados.get("WARNING") + 1);
                }
                if (line.contains("INFO")) {
                    resultados.put("INFO", resultados.get("INFO") + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String results : resultados.keySet()) {
            System.out.println(results + ": " + resultados.get(results));
        }
    }
}
