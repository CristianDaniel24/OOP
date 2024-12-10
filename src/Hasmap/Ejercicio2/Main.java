package Hasmap.Ejercicio2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static HashMap<Integer, Employee> empleados = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n----- Menu Employee -----");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Eliminar Empleado");
            System.out.println("3. Buscar Empleado");
            System.out.println("4. Editar Empleado");
            System.out.println("5. Listar Empleados");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    eliminarEmpleado();
                    break;
                case 3:
                    buscarEmpleado();
                    break;
                case 4:
                    editarEmpleado();
                    break;
                case 5:
                    listarEmpleados();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void agregarEmpleado() {
        System.out.print("\nIngrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el puesto del empleado: ");
        String puesto = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        Employee nuevoEmpleado = new Employee(idCounter, nombre, puesto, salario);
        empleados.put(idCounter, nuevoEmpleado);
        System.out.println("\nEmpleado agregado: " + nuevoEmpleado);
        idCounter++;
    }

    public static void eliminarEmpleado() {
        System.out.print("\nIngrese el ID del empleado a eliminar: ");
        int id = scanner.nextInt();

        if (empleados.containsKey(id)) {
            empleados.remove(id);
            System.out.println("Empleado con ID " + id + " eliminado");
        } else {
            System.out.println("\nEmpleado no encontrado");
        }
    }

    public static void buscarEmpleado() {
        System.out.print("\nIngrese el ID del empleado a buscar: ");
        int id = scanner.nextInt();

        if (empleados.containsKey(id)) {
            Employee empleado = empleados.get(id);
            System.out.println("Empleado encontrado: " + empleado);
        } else {
            System.out.println("\nEmpleado no encontrado");
        }
    }

    public static void editarEmpleado() {
        System.out.print("\nIngrese el ID del empleado a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (empleados.containsKey(id)) {
            Employee empleado = empleados.get(id);
            System.out.print("\nIngrese el nuevo nombre (actual: " + empleado.getNombre() + "): ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo puesto (actual: " + empleado.getPuesto() + "): ");
            String nuevoPuesto = scanner.nextLine();
            System.out.print("Ingrese el nuevo salario (actual: " + empleado.getSalario() + "): ");
            double nuevoSalario = scanner.nextDouble();

            empleado.setNombre(nuevoNombre);
            empleado.setPuesto(nuevoPuesto);
            empleado.setSalario(nuevoSalario);
            System.out.println("\nEmpleado actualizado: " + empleado);
        } else {
            System.out.println("\nEmpleado no encontrado");
        }
    }

    public static void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("\nNo hay empleados");
        } else {
            for (Employee empleado : empleados.values()) {
                System.out.println(empleado);
            }
        }
    }
}