package Streams.EjerciciosTodo.filter;

import java.util.Arrays;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Marta", 4000),
                new Employee("Pedro", 3200),
                new Employee("Ana", 2800),
                new Employee("Luis", 2500)
        );

        List<Employee> employeeFilter = employees.stream()
                .filter(employee -> employee.salary > 3000)
                .toList();

        System.out.println("\nEmployees with salary greater than 3000: " + employeeFilter);
    }

    public static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Name: " + name + "Salary: $" + salary + "  ";
        }
    }
}
