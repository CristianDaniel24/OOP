package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(20.0, 19.2, 3.5);

        List<String> priceFormater = prices.stream()
                .map(price -> String.format("$%.2f", price))
                .collect(Collectors.toList());

        System.out.println(priceFormater);
    }
}
