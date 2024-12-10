package generics.video;

public class Ejercicio1 {
    public static void main(String[] args) {

        Printer<Integer> printerInt = new Printer<>(12);
        printerInt.print();

        Printer<Double> doublePrinter = new Printer<>(2.3);
        doublePrinter.print();

    }
}
