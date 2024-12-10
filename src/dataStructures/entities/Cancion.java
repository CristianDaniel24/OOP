package dataStructures.entities;

public class Cancion implements Comparable<Cancion> {
    private String nombre;
    private Double duracion;

    public Cancion(String nombre, Double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Cancion() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public int compareTo(Cancion otraCancion) {
        return this.getNombre().compareTo(otraCancion.getNombre());
    }
}
