package Streams.EjerciciosNotion.todo.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> studentsTxt = Files.readAllLines(Paths.get("src/Streams/EjerciciosNotion/todo/ejercicio2/Student"));

        List<Student> students = studentsTxt.stream()
                .map(student -> {
                    String[] data = student.split(", ");
                    return new Student(data[0], data[1], Double.parseDouble(data[2]));
                })
                .toList();

        Map<String, List<Student>> studentsSubject = students.stream()
                .collect(Collectors.groupingBy(Student::getSubject));

        studentsSubject.forEach((subject, listStudent) -> {
            System.out.printf("\nSubject: " + subject);
            listStudent.forEach(System.out::println);
            System.out.println();
        });
    }
}
