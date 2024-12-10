package generics.exercices.exercice3;

public class Ejercicio2 {
    public static void main(String[] args) {
        NumberBox<Integer> numberBoxInteger = new NumberBox<>(2, 2);
        System.out.println("Integer");
        System.out.println("Sum: " + numberBoxInteger.add());
        System.out.println("Rest: " + numberBoxInteger.substract());

        NumberBox<Double> doubleNumberBox = new NumberBox<>(5.5, 5.0);
        System.out.println("\nDouble");
        System.out.println("Sum: " + doubleNumberBox.add());
        System.out.println("Rest: " + doubleNumberBox.substract());
    }
}
