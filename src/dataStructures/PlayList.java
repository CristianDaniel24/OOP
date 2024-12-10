package dataStructures;

import dataStructures.entities.Cancion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Cancion> playList = new ArrayList<>();

        Cancion cancion = new Cancion();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSongs Menu");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Search");
            System.out.println("4. Order");
            System.out.println("5. Deleted duplicate");
            System.out.println("6. Exit");
            System.out.println("Enter the option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    //ADD
                    add(playList, scanner);
                    break;
                case 2:
                    //REMOVE
                    delete(playList, scanner);
                    break;
                case 3:
                    //SEARCH
                    search(playList, scanner);
                    break;
                case 4:
                    //ORDER
                    order(playList);
                    break;
                case 5:
                    //DUPLICATE
                    duplicate(playList, scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Enter the option invalid");
            }
        }
    }

    public static void add(ArrayList<Cancion> playList, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the name song for add:");
        String add = scanner.nextLine();
        System.out.println("Enter the duration:");
        Double duration = scanner.nextDouble();
        Cancion cancion = new Cancion(add, duration);
        playList.add(cancion);

        System.out.println("The " + add + " was successfully add");
        System.out.println("\nThe remaining song are:");
        for (Cancion adds : playList) {
            System.out.println(adds.getNombre() + " - " + adds.getDuracion());
        }
    }

    public static void delete(ArrayList<Cancion> playList, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the song to the remove");
        String removeSong = scanner.nextLine();
        Cancion cancionInstancia = new Cancion();
        boolean remove = false;
        for (Cancion cancion : playList) {
            if (cancion.getNombre().equalsIgnoreCase(removeSong)) {
                cancionInstancia = cancion;
                playList.remove(cancionInstancia);
                remove = true;
                break;
            }
        }
        if (remove) {
            System.out.println("The " + removeSong + " was successfully removed");
        } else {
            System.out.println("The song is invalid or not exist");
        }
        System.out.println("\nThe songs are:");
        for (Cancion cancion : playList) {
            System.out.println(cancion.getNombre() + " - " + cancion.getDuracion());
        }
    }

    public static void search(ArrayList<Cancion> playList, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter your search:");
        String searchSong = scanner.nextLine();
        boolean search = false;
        for (Cancion cancion : playList) {
            if (cancion.getNombre().equalsIgnoreCase(searchSong)) {
                search = true;
                break;
            }
        }
        if (search) {
            System.out.println("The " + searchSong + " yes exist in the list");
        } else {
            System.out.println("The " + searchSong + " not exit in the list");
        }
    }

    public static void order(ArrayList<Cancion> playList) {
        //UPWARD
        orderAscending(playList);
        for (Cancion arrayList : playList) {
            System.out.println(arrayList.getNombre());
        }

        //FALLING
        orderDesending(playList);
        for (Cancion arrayList : playList) {
            System.out.println(arrayList);
        }
    }


    public static void duplicate(ArrayList<Cancion> playList, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the song to the remove duplicate");
        String duplicateSong = scanner.nextLine();
        Cancion cancionInstancia = new Cancion();
        boolean remove = false;
        for (Cancion cancion : playList) {
            if (cancion.getNombre().equalsIgnoreCase(duplicateSong)) {
                cancionInstancia = cancion;
                playList.remove(cancionInstancia);
                remove = true;
                break;
            }
        }
        if (remove) {
            System.out.println("The " + duplicateSong + " duplicate was successfully removed");
            System.out.println("\nThe remaining song are:");
            for (Cancion duplicates : playList) {
                System.out.println(duplicates.getNombre() + " - " + duplicates.getDuracion());
            }
        } else {
            System.out.println("The song duplicate is invalid or not exist");
        }
    }

    public static void orderAscending(ArrayList<Cancion> playList) {
        System.out.println("\nOrder ascending");
        Collections.sort(playList);
    }

    public static void orderDesending(ArrayList<Cancion> playList) {
        System.out.println("\nOrder descending");
        Collections.sort(playList, Collections.reverseOrder());
    }
}