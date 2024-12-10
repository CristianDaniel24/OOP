package operadoresLogicos;

import java.util.Scanner;

public class And2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name:");
        String nombre = scanner.nextLine();

        System.out.println("¿You're of age?true/false");
        boolean mayorEdad = scanner.nextBoolean();

        System.out.println("¿Have driving license?true/false");
        boolean licencia = scanner.nextBoolean();

        if (mayorEdad && licencia){
            System.out.println(nombre+" You can drive");
        }else {
            System.out.println(nombre+" you can't drive");
        }
    }
}
