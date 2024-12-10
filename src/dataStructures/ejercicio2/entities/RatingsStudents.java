package dataStructures.ejercicio2.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RatingsStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to the Students: ");
        int size = scanner.nextInt();

        Student[] students = new Student[size];

        //ADD
        add(students, size, scanner);

        //HIGHEST NOTE
        higehstNote(students);

        //DELETE DUPLICATES
        deleteNotes(students, scanner);
    }

    public static void add(Student[] students, int size, Scanner scanner) {
        //ADD STUDENTS
        for (int i = 0; i < size; i++) {
            scanner.nextLine();
            System.out.println("Enter the name to the Student:");
            String name = scanner.nextLine();
            System.out.print("Enter the note: ");
            Double note = scanner.nextDouble();
            Student student = new Student(name, note);
            students[i] = student;
        }

        System.out.println("\nThe students and notes are:");
        for (Student studentss : students) {
            System.out.println(studentss.getNombre() + " - " + studentss.getRatings());
        }
    }

    public static void higehstNote(Student[] students) {
        double noteMaximum = 0;
        String nameNoteMaxium = "";

        for (Student student : students) {
            if (student.getRatings() > noteMaximum) {
                noteMaximum = student.getRatings();
                nameNoteMaxium = student.getNombre();
            }
        }
        System.out.println("\nThe Student " + nameNoteMaxium + " it has the highest note, and it is: " + noteMaximum);
    }

    public static void deleteNotes(Student[] student, Scanner scanner) {
        //Se convierte el Array en una lista
        List<Student> listSongs = Arrays.asList(student);
        //Se crea un ArrayList a partir de una lista
        ArrayList<Student> songsArrayList = new ArrayList<>(listSongs);

        System.out.println("\nDELETED THE STUDENT");
        System.out.println("List to the Students:");
        for (Student studentss : songsArrayList) {
            System.out.println(studentss.getNombre() + " - " + studentss.getRatings());
        }
        scanner.nextLine();
        System.out.println("\nEnter the Student duplicate for delete:");
        String nameDelete = scanner.nextLine();
        Student student1 = new Student();
        boolean delete = false;

        for (Student studentss : songsArrayList) {
            if (studentss.getNombre().equalsIgnoreCase(nameDelete)) {
                student1 = studentss;
                delete = true;
            }
        }
        if (delete) {
            songsArrayList.remove(student1);
            System.out.println("The student yes deleted with successfully");
            System.out.println("\nList the Person remaining");
            for (Student student2 : songsArrayList) {
                System.out.println(student2.getNombre() + " - " + student2.getRatings());
            }
        } else {
            System.out.println("The Student enter is invalid");
        }
    }
}