package Hasmap.Ejercicio3;

public class Student1 {
    private int id;
    private String nombre;
    private int edad;
    private double promedio;

    public Student1(int id, String nombre, int edad, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "\nStudent " + "id:" + id + ", nombre:'" + nombre + '\'' + ", edad:" + edad + ", promedio:" + promedio;
    }
}
