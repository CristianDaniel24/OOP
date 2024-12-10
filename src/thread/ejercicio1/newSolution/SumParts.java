package thread.ejercicio1.newSolution;

import java.util.List;

public class SumParts extends Thread {
    private final Integer part;
    private final List<Integer> values;
    private Integer sum;

    public SumParts(List<Integer> values, Integer part) {
        this.values = values;
        this.part = part;
    }

    @Override
    public void run() {
        this.calculateSum();
    }

    public void calculateSum() {
        int sizePart = values.size() / 5;
        this.sum = values.subList(sizePart * this.part - sizePart, sizePart * this.part)
                .stream()
                .mapToInt(Integer::intValue).sum();
    }

    public Integer getSum() {
        return sum;
    }
}
