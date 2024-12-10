package generics.exercice0;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Box<Integer> numbers = new Box<>(5);
        System.out.println("\nNumber: " + numbers.getItem());
        numbers.setItem(24);
        System.out.println("Number: " + numbers.getItem());

        Box<String> stringBox = new Box<>("\nHello");
        stringBox.setItem(stringBox.getItem().concat(" world"));
        System.out.println(stringBox.getItem());

        Box<Map<String, Double>> mapBox = new Box<>(new HashMap<>());
        mapBox.getItem().put("Carlos", 12.4);
        mapBox.getItem().put("Meli", 20.4);

        mapBox.getItem().entrySet().forEach(values -> {
            System.out.println("\nName: " + values.getKey() + "\nQualification: " + values.getValue());
        });
    }
}
