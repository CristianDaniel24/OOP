package thread.ejercicio1;

import java.util.List;

public class SumParts extends Thread {
    private List<Integer> parts;
    private Integer sum;

    public SumParts(List<Integer> parts) {
        this.parts = parts;
    }

    public Integer getSum() {
        return sum;
    }

    @Override
    public void run() {
        this.sum = parts.stream().mapToInt(Integer::intValue).sum();
    }
}
