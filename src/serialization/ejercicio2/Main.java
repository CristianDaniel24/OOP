package serialization.ejercicio2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        serialize();
        deserializate();
    }

    public static void serialize() {
        Car car = new Car("Bmw", "2028");
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/serialization/ejercicio2/Car.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(car);
            objectOutputStream.close();
            System.out.println("INFO - Car object has been serializated!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserializate() {
        try (FileInputStream fileInputStream = new FileInputStream("src/serialization/ejercicio2/Car.txt")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Car car = (Car) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("INFO - Car object has been deserializated!");
            System.out.println("Brand: " + car.getBrand());
            System.out.println("Model: " + car.getModel());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
