
package parte1;

import java.util.ArrayList;

public class Empleado {
        // Attribute
        private String nombre;
        private int id;
        private ArrayList<String> proyectosEmpleado = new ArrayList<>();
        // Constructor to initialize attributes
        public Empleado(String nombre, int id) {
            this.nombre = nombre;
            this.id = id;
        }
        // Method to add a project
        public void agregarProyecto(String proyectosEmpleado) {
                this.proyectosEmpleado.add(proyectosEmpleado);
        }
        // Method to check if a specific project has been completed
        public void check (String proyectoComparacion) {
                if (proyectosEmpleado.contains(proyectoComparacion)) {
                    System.out.println("El proyecto ya fue realizado");
                    return;
                } else{
                    System.out.println("El proyecto no fue realizado aun");
                }
            }
        // Method to display employee details
        public void detalles() {
            System.out.println("\n Los resultados son:");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("id: " + this.id);
            System.out.println("Los proyectos del Empleado son: ");
            for (int i = 0; i <proyectosEmpleado.size() ; i++) {
                System.out.println(this.proyectosEmpleado.get(i));
            }
        }
}