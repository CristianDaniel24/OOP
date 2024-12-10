package Ejercicios.ejercicio4.entities;

public class Silla extends MueblesHogar{

    private int cantPatas;
    private Double valor;

    public Silla(String nombre,String disenio,String color,int cantPatas,Double valor){
        super(nombre,disenio,color);
        this.cantPatas = cantPatas;
        this.valor = valor;
    }

    public void funcion(){
        System.out.println("La silla sirve para sentarse");
    }
    public void detalles(){
        System.out.println("Nombre: "+nombre+
                "\nDiseño: "+disenio+
                "\nColor: "+color+
                "\nCantidad de patas: "+cantPatas+
                "\nValor: "+valor);
    }
}
