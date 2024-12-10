package thread.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 100) {
            numbers.add(numbers.size() + 1);
        }

        Integer sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        List<Integer> part1 = numbers.subList(0, 20);
        List<Integer> part2 = numbers.subList(20, 40);
        List<Integer> part3 = numbers.subList(40, 60);
        List<Integer> part4 = numbers.subList(60, 80);
        List<Integer> part5 = numbers.subList(80, 100);

        SumParts sumParts1 = new SumParts(part1);
        SumParts sumParts2 = new SumParts(part2);
        SumParts sumParts3 = new SumParts(part3);
        SumParts sumParts4 = new SumParts(part4);
        SumParts sumParts5 = new SumParts(part5);

        sumParts1.start();
        sumParts2.start();
        sumParts3.start();
        sumParts4.start();
        sumParts5.start();

        //Se usa join para esperar a que termine el Thread llamado
        sumParts1.join();
        sumParts2.join();
        sumParts3.join();
        sumParts4.join();
        sumParts5.join();

        int sumTotal = sumParts1.getSum() + sumParts2.getSum() + sumParts3.getSum() + sumParts4.getSum() + sumParts5.getSum();

        System.out.println("Sum from Thread 1: " + sumParts1.getSum());
        System.out.println("Sum from Thread 2: " + sumParts2.getSum());
        System.out.println("Sum from Thread 3: " + sumParts3.getSum());
        System.out.println("Sum from Thread 4: " + sumParts4.getSum());
        System.out.println("Sum from Thread 5: " + sumParts5.getSum());
        System.out.println("Total Sum: " + sumTotal);
    }
}
