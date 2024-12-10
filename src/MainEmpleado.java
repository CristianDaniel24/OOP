
package parte1;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the employee's name and ID
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su Id");
        int id = scanner.nextInt();
        scanner.nextLine();
        // Create an Employee object
        Empleado objetoEmpleado = new Empleado(nombre,id);
        // Add projects
        char choice;
        do {
            System.out.println("Ingresa los proyectos que deseas agregar");
            String proyectos = scanner.nextLine();
            objetoEmpleado.agregarProyecto(proyectos);
            System.out.println("Deseas agregar mas proyectos? (y/n)");
            choice = scanner.next().charAt(0);
            scanner.nextLine();
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Ingrese el proyecto inicial");
        String proyectoComparacion = scanner.nextLine();
        // Check if a specific project has been completed
        objetoEmpleado.check(proyectoComparacion);
        // Display employee details
        objetoEmpleado.detalles();
    }
}