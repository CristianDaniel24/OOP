package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        try (Socket socket = new Socket("127.0.0.1", 8080)) {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            while (!exit) {
                try {
                    System.out.println("\nMenu");
                    System.out.println("1. Start");
                    System.out.println("2. Exit");
                    System.out.println("Enter the option:");
                    int option = Integer.parseInt(reader.readLine());
                    if (option == 1) {
                        System.out.println("Saluda al servidor:");
                        String input = reader.readLine();
                        out.writeUTF(input);
                        System.out.println(in.readUTF());
                    } else if (option == 2) {
                        out.writeUTF("EXIT");
                        System.out.println("Exit..");
                        exit = true;
                    } else {
                        System.out.println("The option is invalid");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter the number, plase");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
