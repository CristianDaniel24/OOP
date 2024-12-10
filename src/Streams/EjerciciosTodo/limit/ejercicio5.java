package Streams.EjerciciosTodo.limit;

import java.util.Arrays;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Bob", 6000),
                new Employee("Alice", 4500),
                new Employee("David", 5000),
                new Employee("Charlie", 7000),
                new Employee("Eve", 5500)
        );

        employees.stream()
                .filter(employee -> employee.getSalary() >= 5000)
                .limit(3)
                .forEach(employee -> System.out.println(employee.getName()));
    }

    public static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }
}
