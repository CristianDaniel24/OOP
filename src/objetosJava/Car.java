package objetosJava;

public class Car {
    private String name;
    private String marca;
    private String color;

    public Car(String name, String marca, String color) {
        this.name = name;
        this.marca = marca;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
