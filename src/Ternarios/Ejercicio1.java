package Ternarios;

public class Ejercicio1 {
    public static void main(String[] args) {
        String name = "Jose";
        String saludo = (name != null) ? "Hola, " + name : "Hola, Usuario";
        System.out.println(saludo);

    }
}
