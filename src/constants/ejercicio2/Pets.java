package constants.ejercicio2;

public class Pets {
    private String name;
    private String color;

    public Pets() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Color: " + color;
    }
}
