package Streams.EjerciciosTodo.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Marta", 25),
                new Person("Ana", 30),
                new Person("Pedro", 22),
                new Person("Juan", 28)
        );

        List<Person> personList1 = personList.stream()
                .sorted(Comparator.comparingInt(person -> person.age))
                .toList();

        System.out.println("The person order is: " + personList1);
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
            return "Name: " + name + "   Age: " + age + "  ";
        }
    }
}
