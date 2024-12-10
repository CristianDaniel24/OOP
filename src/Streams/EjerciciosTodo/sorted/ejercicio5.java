package Streams.EjerciciosTodo.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Juan", 25),
                new Person("Ana", 30),
                new Person("Pedro", 22),
                new Person("Ana", 22),
                new Person("Juan", 25),
                new Person("Marta", 25)
        );

        List<Person> personList1 = personList.stream()
                .sorted(Comparator.comparingInt((Person p) -> p.age)
                        .thenComparing(p -> p.name))
                .toList();

        System.out.println("\nPeople sorted by age and name: " + personList1);
    }

    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name: " + name + " Age:" + age + "  ";
        }
    }
}
