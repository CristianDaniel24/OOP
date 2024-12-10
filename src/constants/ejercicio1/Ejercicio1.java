package constants.ejercicio1;

import java.io.*;

public class Ejercicio1 {
    private static final String PATH = "src/constants/ejercicio1/Person.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu Person");
                System.out.println("1. Read the file");
                System.out.println("2. Write in the file");
                System.out.println("3. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                if (option == 1) {
                    readFile();
                } else if (option == 2) {
                    writeFile(reader);
                } else if (option == 3) {
                    exit = true;
                } else {
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
        System.out.println("\nThe file of the person has:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void writeFile(BufferedReader reader) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true));
        Person person = new Person();

        System.out.println("\nEnter the name of the person:");
        person.setName(reader.readLine());
        System.out.println("Enter the age of the person:");
        person.setAge(Integer.parseInt(reader.readLine()));

        writer.write(person + System.lineSeparator());
        writer.close();
    }
}
