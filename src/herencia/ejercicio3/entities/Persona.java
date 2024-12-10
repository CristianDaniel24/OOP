package herencia.ejercicio3.entities;
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void detallesPersona() {
        System.out.println("\nEl nombre del la persona es:");
        System.out.println(this.nombre);
        System.out.println("La edad de la persona es:");
        System.out.println(this.edad);
        }
    }