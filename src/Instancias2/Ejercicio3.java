package Instancias2;

public class Ejercicio3 {
    public static void main(String[] args) {
        Persona persona = new Persona("Jose", 20);

        // Usamos el retorno del metodo para imprimir los detalles
        String detalles = printDetails(persona);
        System.out.println(detalles);
    }

    public static String printDetails(Persona persona) {
        return "Nombre: " + persona.nombre + "\nEdad: " + persona.edad;
    }

    public static class Persona {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
}