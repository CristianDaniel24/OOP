package Ejercicios.ejercicio1.entities;

public class  Vivienda {

    protected String nombrePropietario;
    protected int edad;

    public Vivienda(String nombrePropietario,int edad){
        this.nombrePropietario = nombrePropietario;
        this.edad = edad;
    }
    public void detalles(){
        System.out.println("Tipos de vivienda");
    }
}
