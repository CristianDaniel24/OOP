package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(7070)) {
            while (serverSocket.isBound()) {
                Socket client = serverSocket.accept();
                ThreadService threadService = new ThreadService(client);
                Thread thread = new Thread(threadService);
                thread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
