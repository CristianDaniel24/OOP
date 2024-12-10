package Streams.EjerciciosNotion.todo.ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> studentsTxt = Files.readAllLines(Paths.get("src/Streams/EjerciciosNotion/todo/ejercicio3/Student"));

        List<Student> students = studentsTxt.stream()
                .map(s -> {
                    String[] data = s.split(", ");
                    return new Student(data[0], data[1], Double.parseDouble(data[2]));
                })
                .toList();

        Map<String, Double> averageQualification = students.stream()
                .collect(Collectors.groupingBy(Student::getSubject, Collectors.averagingDouble(Student::getQualification)));

        averageQualification.forEach((subject, average) -> {
            System.out.printf("%nSubject: %s %nAverage: %.1f%n", subject, average);
        });
    }
}
