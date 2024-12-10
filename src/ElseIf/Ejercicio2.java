package ElseIf;

public class Ejercicio2 {
    public static void main(String[] args) {
        String color = "verde";

        if (color.equals("rojo")) {
            System.out.println("Detente");
        } else if (color.equals("amarillo")) {
            System.out.println("Preparate");
        } else if (color.equals("verde")) {
            System.out.println("Avanza");
        } else {
            System.out.println("Color no valido");
        }
    }
}
