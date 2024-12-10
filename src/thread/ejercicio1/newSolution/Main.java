package thread.ejercicio1.newSolution;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();

        while (data.size() < 100) {
            data.add(data.size() + 1);
        }

        SumParts t1 = new SumParts(data, 1);
        SumParts t2 = new SumParts(data, 2);
        SumParts t3 = new SumParts(data, 3);
        SumParts t4 = new SumParts(data, 4);
        SumParts t5 = new SumParts(data, 5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int total = t1.getSum() + t2.getSum() + t3.getSum() + t4.getSum() + t5.getSum();
        System.out.println("Sum from Thread 1: " + t1.getSum());
        System.out.println("Sum from Thread 2: " + t2.getSum());
        System.out.println("Sum from Thread 3: " + t3.getSum());
        System.out.println("Sum from Thread 4: " + t4.getSum());
        System.out.println("Sum from Thread 5: " + t5.getSum());
        System.out.println("Total: " + total);
    }
}
