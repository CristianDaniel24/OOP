package Hasmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicioo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Estudiante> students = new HashMap<>();
        int id = 0;

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu to Students");
            System.out.println("1. Add Studnet");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. Details of the Student");
            System.out.println("6. Exit");
            System.out.println("Enter the option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    id++;
                    add(students, id, scanner);
                    break;
                case 2:
                    delete(students, scanner);
                    break;
                case 3:
                    update(students, scanner);
                    break;
                case 4:
                    search(students, scanner);
                    break;
                case 5:
                    details(students);
                    break;
                case 6:
                    System.out.println("\nBye..");
                    exit = true;
                    break;
                default:
                    System.out.println("\nThe option is invalid");
            }
        }
    }

    public static void add(HashMap<Integer, Estudiante> students, int id, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the name of Student:");
        String name = scanner.nextLine();
        System.out.println("Enter the grade of Student:");
        String grade = scanner.nextLine();
        students.put(id, new Estudiante(name, grade));
        System.out.println("\nThe Student add is: " + "\nName: " + name + " \nGrade: " + grade + " \nId: #" + id);

    }

    public static void delete(HashMap<Integer, Estudiante> students, Scanner scanner) {
        if (!students.isEmpty()) {
            scanner.nextLine();
            System.out.println("Enter the name of Student for delete:");
            String nameDelete = scanner.nextLine();
            int id = 0;
            for (Map.Entry<Integer, Estudiante> estudianteEntry : students.entrySet()) {
                if (estudianteEntry.getValue().getName().equalsIgnoreCase(nameDelete)) {
                    id = estudianteEntry.getKey();
                }
            }
            if (id != 0) {
                students.remove(id);
                details(students);
            } else
                System.out.println("Student is invalid or doesn't exist");
        } else {
            System.out.println("Student doesn't exist =(");
        }
    }

    public static void update(HashMap<Integer, Estudiante> students, Scanner scanner) {
        if (!students.isEmpty()) {
            scanner.nextLine();
            System.out.println("Enter the Id of the Student for Update:");
            int idUpdate = scanner.nextInt();
            if (students.containsKey(idUpdate)) {
                scanner.nextLine();
                System.out.println("Enter the new Name of the Student:");
                String nameUpdate = scanner.nextLine();
                System.out.println("Enter the new Grade of the Student:");
                String gradeUpdate = scanner.nextLine();
                Estudiante estudiante1 = new Estudiante(nameUpdate, gradeUpdate);
                students.put(idUpdate, estudiante1);
                details(students);
            } else
                System.out.println("The Id is invalid or not exists");
        } else {
            System.out.println("Not exists Students =(");
        }
    }

    public static void search(HashMap<Integer, Estudiante> students, Scanner scanner) {
        if (!students.isEmpty()) {
            scanner.nextLine();
            System.out.println("Enter the Id of Student to search:");
            int idSearch = scanner.nextInt();
            Estudiante estudiante = students.get(idSearch);
            if (estudiante != null) {
                System.out.println("The Student: " + estudiante.getName() + " yes exists" + "\nGrade: " + estudiante.getGrade());
            } else {
                System.out.println("The student doesn't exist");
            }
        } else {
            System.out.println("Not exists Students =(");
        }
    }

    public static void details(HashMap<Integer, Estudiante> students) {
        if (!students.isEmpty()) {
            System.out.printf("%nThe Students are:");
            for (Estudiante details : students.values()) {
                System.out.printf("%n-Name: %s %n-Grade: %s", details.getName(), details.getGrade());
            }
        } else {
            System.out.printf("%nNot exists Students =(");
        }
        System.out.printf("%n");
    }
}
