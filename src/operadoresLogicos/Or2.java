package operadoresLogicos;

import java.util.Scanner;

public class Or2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO YOUR TRUSTED STORE GAME ");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nList of products:");
            System.out.println("1. Console xbox with/without games");
            System.out.println("2. Console PlayStation with/without games");
            System.out.println("3. Exit");
            System.out.println("Enter an option:");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿You want order the console xbox with games included?true/false");
                    boolean gamesXboxYes = scanner.nextBoolean();
                    System.out.println("¿Tienes tarjeta de descuento?");
                    boolean tarjetaXbox = scanner.nextBoolean();
                    if (gamesXboxYes || tarjetaXbox){
                        System.out.println("Realizando pedido..");
                    }else {
                        System.out.println("Pedido invalido");
                    }
                    return;
                case 2:
                    System.out.println("¿Deseas ordenar una playStation con juegos incluidos?true/false");
                    boolean gamesPlayStationYes = scanner.nextBoolean();
                    System.out.println("¿Tienes tarjeta de descuento?");
                    boolean cardPlay = scanner.nextBoolean();
                    if (gamesPlayStationYes || cardPlay){
                        System.out.println("Realizando pedido..");
                    }else {
                        System.out.println("Pedido invalido");
                    }
                    return;
                case 3:
                    exit = true;
                    return;
                default:
                    System.out.println("La opcion ingresada es invalida");
            }
        }
    }
}