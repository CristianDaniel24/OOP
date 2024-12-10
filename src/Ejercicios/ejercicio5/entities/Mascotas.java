package Ejercicios.ejercicio5.entities;

public abstract class Mascotas {

    protected String nombre;
    protected String amigable;
    protected String comida;

    public Mascotas(String nombre,String amigable,String comida){
        this.nombre = nombre;
        this.amigable = amigable;
        this.comida = comida;
    }
    public abstract void funcion();
    public abstract void detalles();
}