package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            try (ServerSocket serverSocket = new ServerSocket(8080)) {
                Socket client = serverSocket.accept();
                System.out.println("[INFO] - Client connected");
                DataInputStream in = new DataInputStream(client.getInputStream());
                DataOutputStream out = new DataOutputStream(client.getOutputStream());
                String inputClient = in.readUTF();
                if (inputClient.equalsIgnoreCase("EXIT")) {
                    System.out.println("[INFO] - Client disconnected");
                    //exit = true;
                } else {
                    out.writeUTF("Bienvenido usuario");
                    System.out.println("[INFO] - Message sent");
                }
            } catch (SocketException e) {
                System.out.println("[INFO] - Client disconnected");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
