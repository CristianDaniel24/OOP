package Hasmap.Ejercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static HashMap<Integer, Student1> estudiantes = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n----- Menu Student -----");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Eliminar Estudiante");
            System.out.println("3. Buscar Estudiante");
            System.out.println("4. Editar Estudiante");
            System.out.println("5. Listar Estudiantes");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion:");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    eliminarEstudiante();
                    break;
                case 3:
                    buscarEstudiante();
                    break;
                case 4:
                    editarEstudiante();
                    break;
                case 5:
                    listarEstudiantes();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void agregarEstudiante() {
        System.out.print("\nIngrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        Student1 nuevoEstudiante = new Student1(idCounter, nombre, edad, promedio);
        estudiantes.put(idCounter, nuevoEstudiante);
        System.out.println("\nEstudiante agregado: " + nuevoEstudiante);
        idCounter++;
    }

    public static void eliminarEstudiante() {
        System.out.print("Ingrese el ID del estudiante a eliminar: ");
        int id = scanner.nextInt();

        if (estudiantes.containsKey(id)) {
            estudiantes.remove(id);
            System.out.println("\nEstudiante con ID " + id + " eliminado");
        } else {
            System.out.println("\nEstudiante no encontrado");
        }
    }

    public static void buscarEstudiante() {
        System.out.print("\nIngrese el ID del estudiante a buscar: ");
        int id = scanner.nextInt();

        if (estudiantes.containsKey(id)) {
            Student1 estudiante = estudiantes.get(id);
            System.out.println("Estudiante encontrado: " + estudiante);
        } else {
            System.out.println("\nEstudiante no encontrado");
        }
    }

    public static void editarEstudiante() {
        System.out.print("Ingrese el ID del estudiante a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (estudiantes.containsKey(id)) {
            Student1 estudiante = estudiantes.get(id);
            System.out.print("\nIngrese el nuevo nombre (actual: " + estudiante.getNombre() + "): ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese la nueva edad (actual: " + estudiante.getEdad() + "): ");
            int nuevaEdad = scanner.nextInt();
            System.out.print("Ingrese el nuevo promedio (actual: " + estudiante.getPromedio() + "): ");
            double nuevoPromedio = scanner.nextDouble();

            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
            estudiante.setPromedio(nuevoPromedio);
            System.out.println("\nEstudiante actualizado: " + estudiante);
        } else {
            System.out.println("\nEstudiante no encontrado");
        }
    }

    public static void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes");
        } else {
            for (Student1 estudiante : estudiantes.values()) {
                System.out.println(estudiante);
            }
        }
    }
}