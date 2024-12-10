package Streams;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practicas {
    public static void main(String[] args) {

        IntSummaryStatistics stats = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats);
// Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
    }
}
