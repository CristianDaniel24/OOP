package herencia.ejercicio3.entities;

public class Profesor extends Persona{
    private String materia;

    public Profesor(String nombre, int edad, String materia){
        super(nombre, edad);
        this.materia = materia;
    }

    @Override
    public void detallesPersona(){
        System.out.println("\nLa materia del profesor es:");
        System.out.println(this.materia);
    }
}