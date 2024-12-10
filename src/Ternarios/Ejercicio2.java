package Ternarios;

public class Ejercicio2 {
    public static void main(String[] args) {

        double precio = 100;
        boolean descuento = true;

        double precioFinal = descuento ? precio * 0.9 : precio;
        System.out.println("El precio final es: " + precioFinal);
    }
}
