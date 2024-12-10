package herencia.ejercicio3.entities;

public class Estudiante extends Persona{
    private int grado;

    public Estudiante(String nombre, int edad, int grado){
        super(nombre, edad);
        this.grado = grado;
    }

    @Override
    public void detallesPersona(){
        System.out.println("\nLos detalles del estudiante son:");
        System.out.println(this.grado);
    }
}