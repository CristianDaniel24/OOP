package generics;

import java.util.List;

public class EjercicioNotion {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Double> numbersDecimals = List.of(1.2, 4.5, 6.7, 5.8);

        System.out.println("Sum of the numbers: " + sumValues(numbers));
        System.out.println("\nSum of the decimals: " + sumValues(numbersDecimals));
    }

    public static <T extends Number> Double sumValues(List<T> list) {
        return list.stream()
                .mapToDouble(Number::doubleValue)
                .reduce(0.0, Double::sum);
    }
}
