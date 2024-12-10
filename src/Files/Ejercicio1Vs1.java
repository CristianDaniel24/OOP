package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ejercicio1Vs1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rutaFile = "src/Files/lectura.txt";

        String rutaFile2 = "src/Files/lectura4.txt";
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\nFile menu");
                System.out.println("1. Read the file:");
                System.out.println("2. Edit the file:");
                System.out.println("3. Number of words in the file:");
                System.out.println("4. Search for a word:");
                System.out.println("5. Read the logAnalizting:");
                System.out.println("6. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        readFile(rutaFile, rutaFile2, reader);
                        break;
                    case 2:
                        editFile(rutaFile, reader);
                        break;
                    case 3:
                        amountWords(rutaFile);
                        break;
                    case 4:
                        searchWord(rutaFile);
                        break;
                    case 5:
                        readLogAnalizting(rutaFile2);
                        break;
                    case 6:
                        System.out.println("Bye..");
                        exit = true;
                        break;
                    default:
                        System.out.println("The option is invalid");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, Please!!");
            }
        }
    }

    public static void readFile(String rutaFile, String rutaFile2, BufferedReader inputReader) {
        try {
            String line;
            System.out.println("\n1. Read the File 1");
            System.out.println("2. Read the File 2");
            System.out.println("Enter the option:");
            int option = Integer.parseInt(inputReader.readLine());
            String file = option == 1 ? rutaFile : rutaFile2;

            if (option != 1 && option != 2) {
                System.out.println("Incorrect option, you must select option 1 or 2");
                return;
            }

            try (BufferedReader readerFile = new BufferedReader(new FileReader(file))) {
                System.out.println("\nThe file has:");
                while ((line = readerFile.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("\nAn error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void editFile(String rutaFile, BufferedReader reader) {
        try {
            System.out.println("Enter the text: ");
            String text = reader.readLine();
            System.out.println("\n1. Append text, ");
            System.out.println("2. Override text");
            System.out.println("Enter the option:");
            int option = Integer.parseInt(reader.readLine());
            boolean append = option == 1;

            BufferedWriter reader1 = new BufferedWriter(new FileWriter(rutaFile, append));
            reader1.write(text + System.lineSeparator());
            reader1.close();
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void amountWords(String rutaFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaFile))) {

            String line;
            int countWords = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                countWords += words.length;
            }

            System.out.println("\nThe file has " + countWords + " words");
        } catch (IOException e) {
            System.out.println("\nAn error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void searchWord(String rutaFile) {
        List<String> text = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaFile))) {
            String line;
            System.out.println("Enter the word for search:");
            String wordSearch = reader.readLine();

            while ((line = reader.readLine()) != null) {
                line = line + System.lineSeparator();
                text.add(line);
            }
            for (String words : text) {
                if (words.contains(wordSearch)) {
                    System.out.println("The word: " + wordSearch + " Yes exist");
                } else {
                    System.out.println("The word: " + wordSearch + " Not exist");
                }
            }
        } catch (IOException e) {
            System.out.println("\nAn error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void readLogAnalizting(String rutaFile2) {

        HashMap<String, Integer> resultados = new HashMap<>();
        resultados.put("ERROR", 0);
        resultados.put("WARN", 0);
        resultados.put("INFO", 0);

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaFile2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    resultados.put("ERROR", resultados.get("ERROR") + 1);
                } else if (line.contains("WARN")) {
                    resultados.put("WARN", resultados.get("WARN") + 1);
                } else if (line.contains("INFO")) {
                    resultados.put("INFO", resultados.get("INFO") + 1);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("the number of words is:");
        for (String results : resultados.keySet()) {
            System.out.println(results + ": " + resultados.get(results));
        }
    }
}