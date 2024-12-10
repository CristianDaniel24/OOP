
package herencia.ejercicio2;

import herencia.ejercicio2.entities.Desarrollador;
import herencia.ejercicio2.entities.Empleado;
import herencia.ejercicio2.entities.Manager;

public class Main {
    public static void main(String[] args) {
            // Create an array of Employee objects
            Empleado[] employees = {
                    new Manager("Alice", 90.000, "HR"),
                    new Desarrollador("Bob", 80.000, "Java"),
                    new Manager("Charlie", 100.000, "IT"),
                    new Desarrollador("Diana", 85.000, "Python")
            };
            // Display details and calculate bonuses for each employee
            for (Empleado employee : employees) {
                employee.detallesEmpleado();
            }
        }
    }