package Streams.EjerciciosTodo.filter;

import java.util.Arrays;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Juan", 25),
                new Person("Pedro", 28),
                new Person("Marta", 30),
                new Person("Maria", 28)
        );

        List<Person> personFilter = persons.stream()
                .filter(person -> person.age > 24 && person.name.startsWith("M"))
                .toList();

        System.out.println("\nThe persons filter are: " + personFilter);
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
