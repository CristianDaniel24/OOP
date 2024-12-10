package Streams.EjercicioStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("src/Streams/EjercicioStreams/Person.txt"));

        List<Employee> employees = lines.stream()
                .map(line -> {
                    String[] data = line.split(",");
                    return new Employee(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]));
                })
                .toList();
        Map<String, Double> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average by department");
        grouped.forEach((department, salary) -> System.out.printf("%s: %f%n", department, salary));
        System.out.println("\nEmployees:");
        employees.stream().filter(employee -> employee.getSalary() > 60000).forEach(System.out::println);
    }
}

/*
public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/Streams/EjercicioStreams/Person.txt"));

        List<Employee> employees = lines.stream()
                .map(line -> {
                    String[] data = line.split(",");
                    return new Employee(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]));
                })
                .toList();

        Map<String, List<Employee>> employeeDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));


        employeeDepartment.forEach((department, listEmployes) -> {
            System.out.println("\nDepartment: " + department);
            Double average;
            Double total = listEmployes.stream()
                    .mapToDouble(employee -> employee.getSalary()).sum();
            average = total / listEmployes.size();
            System.out.println("Average: " + average);
        });

        employeeDepartment.forEach((department, listEmployees) -> {
            listEmployees.stream()
                    .filter(employee -> employee.getSalary() > 60000)
                    .forEach(System.out::println);
        });
    }
}
 */