package parte1;

import java.util.Scanner;

public class MainBajo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las caracteristicas para crear un bajo");
        System.out.println("¿color?");
        String color = scanner.nextLine();
        System.out.println("¿marca?");
        String marca = scanner.nextLine();
        System.out.println("¿modelo?");
        String modelo = scanner.nextLine();
        System.out.println("¿año?");
        int year = scanner.nextInt();

        Bajo bajoElectrico = new Bajo(color, marca, modelo, year);
        bajoElectrico.imprimir();

        bajoElectrico.sonar();
    }
}
