package dataStructures.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioPlaylistArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Cancion> playList = new ArrayList<>();

        Cancion cancion = new Cancion("Song", 1.20);

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
                    scanner.nextLine();
                    System.out.println("Enter the song for add");
                    String songAdd = scanner.nextLine();

                    System.out.println("Enter the duration to the song:");
                    Double duration = scanner.nextDouble();

                    playList.add(new Cancion(songAdd, duration));
                    System.out.println("The " + songAdd + " was successfully add");
                    System.out.println("\nThe remaining song are:");
                    for (Cancion listAddSong : playList) {
                        System.out.println(listAddSong);
                    }
                    break;
                case 2:
                    //REMOVE
                    scanner.nextLine();
                    System.out.println("Enter the song to the remove");
                    String remove = scanner.nextLine();
                    if (cancion.getNombre().equals(remove)) {
                        playList.remove(remove);
                        System.out.println("The " + remove + " was successfully removed");
                        System.out.println("\nThe remaining song are:");
                        for (Cancion ListRemoveSong : playList) {
                            System.out.println(ListRemoveSong);
                        }
                    } else {
                        System.out.println("The song is invalid or not exist");
                    }
                    break;
                case 3:
                    //SEARCH
                    scanner.nextLine();
                    System.out.println("Enter your search:");
                    String search = scanner.nextLine();

                    if (cancion.getNombre().equals(search)) {
                        System.out.println("The " + search + " yes exist in the list");
                    } else {
                        System.out.println("The " + search + " not exit in the list");
                    }
                    break;
                case 4:
                    //ORDER
                    Collections.sort(playList, (Cancion p1, Cancion p2) -> p1.getNombre().compareTo(p2.getNombre()));
                    System.out.println("\nAscending song for name:");
                    for (Cancion ListOrderSong : playList) {
                        System.out.println(ListOrderSong);
                    }
                    //FALLING
                    Collections.sort(playList, (Cancion p1, Cancion p2) -> p2.getNombre().compareTo(p1.getNombre()));
                    System.out.println("\nDescendant song for name:");
                    for (Cancion ListOrderSong : playList) {
                        System.out.println(ListOrderSong);
                    }
                    break;
                case 5:
                    //DUPLICATE
                    scanner.nextLine();
                    System.out.println("Enter the song to the remove duplicate");
                    String duplicate = scanner.nextLine();
                    if (cancion.getNombre().contains(duplicate)) {
                        playList.remove(duplicate);
                        System.out.println("The " + duplicate + " duplicate was successfully removed");
                        System.out.println("\nThe remaining song are:");
                        for (Cancion duplicatesSongs : playList) {
                            System.out.println(duplicatesSongs);
                        }
                    } else {
                        System.out.println("The song duplicate is invalid or not exist");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Enter the option invalid");
            }
        }
    }
}
