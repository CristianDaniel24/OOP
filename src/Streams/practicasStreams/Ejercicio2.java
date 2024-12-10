package Streams.practicasStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Agrupa las personas por edad utilizando Streams
        List<Person> products = Arrays.asList(
                new Person("Juan", 30),
                new Person("Ana", 25),
                new Person("Pedro", 30),
                new Person("Beatriz", 25)
        );

        Map<Integer, List<Person>> persons = products.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        persons.forEach((age, person) -> {
            person.forEach(person1 -> {
                System.out.printf("\nName: %s", person1.getName());
            });
            System.out.printf("\nAge: %d", age);
        });
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
