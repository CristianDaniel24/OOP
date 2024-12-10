package Ejercicios.ejercicio4.entities;

public abstract class MueblesHogar {

    protected String nombre;
    protected String disenio;
    protected String color;

    public MueblesHogar(String nombre,String disenio,String color){
        this.nombre = nombre;
        this.disenio = disenio;
        this.color = color;
    }
    public abstract void funcion();
    public abstract void detalles();
}
