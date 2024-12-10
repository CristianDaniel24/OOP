package ElseIf;

public class Ejercicio3 {
    public static void main(String[] args) {
        int calificacion = 90;

        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Muy bien");
        } else if (calificacion >= 70) {
            System.out.println("Bien");
        } else {
            System.out.println("Necesitas mejorar bro");
        }
    }
}
