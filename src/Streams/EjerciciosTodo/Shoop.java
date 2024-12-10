package Streams.EjerciciosTodo;

import java.util.List;
import java.util.Optional;

public class Shoop {
    public static void main(String[] args) {

        List<Thief> thieves = List.of(new Thief("Mary jane", 35), new Thief("Jefry Doe", 42));

        Optional<Thief> thief = thieves.stream()
                .filter(thief1 -> thief1.getName().equals("Jefry Doe"))
                .findFirst();

        if (thief.isPresent()) {
            System.out.println("\nFound thief: " + thief.get().getName());
        } else {
            System.out.println("\nNo such thief found");
        }
    }
}
