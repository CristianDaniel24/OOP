package Streams.practice.practice1;

public class Main {
    /*
    public static void main(String[] args) throws IOException {
        List<String> employeesFile = Files.readAllLines(Paths.get("/src/Streams/practice/practice1"));

        List<Employee> employeesList = employeesFile.stream()
                .map(line -> {
                    String[] data = line.split(",");
                    return new Employee(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]));
                })
                .toList();

        Map<String, List<Employee>> employees = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employees.forEach((department, listEmployee) -> {
            Double total = 0.0;
            Double average;
            System.out.println("\nDepartment: " + department);
            listEmployee.forEach(employee -> {
                return total += employee.getSalary();
            });
            average = total / listEmployee.size();
        });
    }

     */
}
