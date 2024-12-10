package Ejercicios.ejercicio5.entities;

public class Gato extends Mascotas{

    private String color;
    private String raza;

    public Gato(String nombre,String amigable,String comida,String color,String raza){
        super(nombre,amigable,comida);
        this.color = color;
        this.raza = raza;
    }

    public void funcion(){
        System.out.println("El Gato maulla y ronronea🐈");
    }

    public void detalles(){
        System.out.println("Nombre de la Mascota: "+nombre+
                "\n¿Amigable?: "+amigable+
                "\nComida: "+comida+
                "\nColor: "+color+
                "\nRaza: "+raza);
    }
}
