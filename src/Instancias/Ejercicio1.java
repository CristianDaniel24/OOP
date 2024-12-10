package Instancias;

public class Ejercicio1 {

    public static void main(String[] args) {
        Persona persona = new Persona("Jose", 20);
        printDetails(persona);
    }

    public static void printDetails(Persona persona) {
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
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
