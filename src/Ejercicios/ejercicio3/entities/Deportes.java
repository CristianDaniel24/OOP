package Ejercicios.ejercicio3.entities;

public class Deportes {

    protected String nombreDeporte;

    public Deportes(String nombreDeporte){
        this.nombreDeporte = nombreDeporte;
    }
    public void detalles(){
        System.out.println("Deporte:");
    }
}