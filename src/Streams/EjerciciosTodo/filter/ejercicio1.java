package Streams.EjerciciosTodo.filter;

import java.util.Arrays;
import java.util.List;

public class ejercicio1 {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Pedro", 22),
                new Person("Marta", 28),
                new Person("Juan", 25),
                new Person("Ana", 30)
        );

        List<Person> personElderly = persons.stream()
                .filter(person -> person.age > 24)
                .toList();

        System.out.println("\nPeople over 24 years of age: " + personElderly);
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
            return "Name: " + name + "Age: " + age + "  ";
        }
    }
}
