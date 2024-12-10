package serialization.ejercicio2;

import java.io.Serial;
import java.io.Serializable;

public class Car implements Serializable {
    @Serial
    //= 1L == Alt + Enter
    private static final long serialVersionUID = -3279690979263660507L;

    private final String brand;
    private final String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
