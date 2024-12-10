package constants.ejercicio2;

import java.io.*;

public class Main {
    private static final String PATH = "src/constants/ejercicio2/Pets.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu Pets");
                System.out.println("1. Read the file");
                System.out.println("2. Write in the file");
                System.out.println("3. Overwrite in the file");
                System.out.println("4. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        readFile();
                        break;
                    case 2:
                        writeFile(reader, true);
                        break;
                    case 3:
                        writeFile(reader, false);
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("The option is invalid");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please");
            }
        }
    }

    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(PATH));
        String line;
        System.out.println("\nThe file of pets has:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void writeFile(BufferedReader reader, boolean append) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, append));
        Pets pet = new Pets();

        System.out.println("\nEnter the name of the pet:");
        pet.setName(reader.readLine());
        System.out.println("Enter the color of the pet:");
        pet.setColor(reader.readLine());

        writer.write(pet + System.lineSeparator());
        writer.close();
    }
}
