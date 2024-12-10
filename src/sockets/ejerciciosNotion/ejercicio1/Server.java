package sockets.ejerciciosNotion.ejercicio1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9090)) {
            while (serverSocket.isBound()) {
                Socket client = serverSocket.accept();

                ThreadSocket threadSocket = new ThreadSocket(client);
                Thread thread = new Thread(threadSocket);
                thread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
