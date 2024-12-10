package operadoresLogicos;

import java.util.Scanner;

public class And {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the year:");
            int minimumAge = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the city:");
            String city = scanner.nextLine();

            if (minimumAge >= 18 && city.equalsIgnoreCase("Bogota")){
                System.out.println("You can vote");
            }else {
                System.out.println("You can't vote");
            }
        }
    }