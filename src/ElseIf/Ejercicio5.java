package ElseIf;

public class Ejercicio5 {
    public static void main(String[] args) {
        int age = 18;

        if (age < 13) {
            System.out.println("Es un niño");
        } else if (age < 18) {
            System.out.println("Es un adolescente");
        } else if (age < 65) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un adulto mayor");
        }
    }
}
