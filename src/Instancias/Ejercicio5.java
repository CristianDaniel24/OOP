package Instancias;

public class Ejercicio5 {
    public static void main(String[] args) {

        Coche coche = new Coche("Toyota", 100);
        aumentarVelocidad(coche, 30);
        System.out.println("Velocidad actual: " + coche.velocidad);
    }

    public static void aumentarVelocidad(Coche coche, int incremento) {
        coche.velocidad += incremento;
    }

    public static class Coche {
        String marca;
        int velocidad;

        Coche(String marca, int velocidad) {
            this.marca = marca;
            this.velocidad = velocidad;
        }
    }
}
