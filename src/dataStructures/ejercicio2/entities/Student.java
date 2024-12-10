package dataStructures.ejercicio2.entities;

public class Student {

    private String nombre;
    private Double ratings;

    public Student(String nombre, Double ratings) {
        this.nombre = nombre;
        this.ratings = ratings;
    }

    public Student() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getRatings() {
        return this.ratings;
    }

    public void setRatings(Double ratings) {
        this.ratings = ratings;
    }

}