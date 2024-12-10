package Instancias;

public class Ejercicio2 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 3);
        double area = calcularArea(rectangulo);
        System.out.println("El area es: " + area);
    }

    public static double calcularArea(Rectangulo rectangulo) {
        return rectangulo.largo * rectangulo.ancho;
    }


    public static class Rectangulo {
        double largo;
        double ancho;

        Rectangulo(double largo, double ancho) {
            this.largo = largo;
            this.ancho = ancho;
        }
    }


}
