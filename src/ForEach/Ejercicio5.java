package ForEach;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Car> cars = new LinkedList<>();

        System.out.println("Enter the size of the cars:");
        int size = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name:");
            String name = scanner.nextLine();
            System.out.println("Enter the brand:");
            String brand = scanner.nextLine();
            Car car = new Car(name, brand);
            cars.add(car);
        }
        System.out.println("The cars are:");
        for (Car car : cars) {
            System.out.println("\n-Name: " + car.getName() + "\n-Brand: " + car.getBrand());
        }
    }
}
