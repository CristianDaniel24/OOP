package serialization.ejercicio;

import java.io.Serializable;

public class Person implements Serializable {
    public static String pais = "Colombia";
    private String name;
    private int age;
    private transient String city;

    public Person() {
    }

    public static void setPais(String pais) {
        Person.pais = pais;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nCity: " + city;
    }
}
