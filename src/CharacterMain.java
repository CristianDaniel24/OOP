package parte1;

import java.util.Scanner;

public class CharacterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PERSONAJE 1");
        System.out.println("Ingrese el nombre del jugador");
        String name = scanner.nextLine();
        System.out.println("Ingrese los puntos de vida");
        int healthPoints = scanner.nextInt();
        System.out.println("ingrese el daño de el puño");
        int strength = scanner.nextInt();

        Character personaje1 = new Character(name,healthPoints,strength);

        //JUGADOR 2
        scanner.nextLine();
        System.out.println("\nPERSONAJE 2");
        System.out.println("Ingrese el nombre del jugador");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese los puntos de vida");
        int vida2 = scanner.nextInt();
        System.out.println("ingrese el daño de el puño");
        int danio2 = scanner.nextInt();

        Character opponent = new Character(nombre2, vida2, danio2);
        System.out.println("\nATACANDO!!");
        personaje1.attack(opponent);
        opponent.attack(personaje1);
        System.out.println("\nRESULTADO");
        personaje1.detalles();
        System.out.println("\n");
        opponent.detalles();
    }
}
