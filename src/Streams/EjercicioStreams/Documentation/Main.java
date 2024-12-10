package Streams.EjercicioStreams.Documentation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        //Creacion de la lista con la informacion del archivo txt
        List<String> employeeFile = Files.readAllLines(Paths.get("src/Streams/EjercicioStreams/Documentation/Person.txt"));

        //Instancia con la informacion de la lista
        List<Streams.EjercicioStreams.Documentation.Employees> employees = employeeFile.stream()
                .map(line -> {
                    String[] data = line.split(",");
                    return new Employees(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]));
                })
                .toList();

        //Agrupar los employee por departamento
        Map<String, List<Employees>> department = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment));

        //Promedio de los employee por cada departamento
        //Impresion de los departamentos con su respectivo promedio
        department.forEach((departmentEmployee, listEmployes) -> {
            System.out.println("\nDepartment: " + departmentEmployee);
            Double averageEmployee;
            Double total = listEmployes.stream()
                    .mapToDouble(employee -> employee.getSalary()).sum();
            averageEmployee = total / listEmployes.size();
            System.out.println("Average: " + averageEmployee);
        });

        department.forEach((_, listEmployees) -> {
            listEmployees.stream()
                    .filter(employee -> employee.getSalary() > 60000)
                    .forEach(System.out::println);
        });
    }
}
