package thread.ejerciciosCompletos.ejercicio2;

import java.util.List;

public class ThreadClassEjercicio2 extends Thread {
    private List<Integer> numbers;
    private List<Integer> listFinal;

    public ThreadClassEjercicio2(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        listFinal = numbers.stream()
                .map(number -> number * number)
                .toList();
    }

    public void print() {
        System.out.println("\nNumbers");
        listFinal.forEach(n -> System.out.println("The numbers are: " + n));
    }
}
