package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicios6Files.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 8080;
        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("[INFO] - Listening in port: " + port);

            while (server.isBound()) {
                Socket client = server.accept();
                System.out.println("[INFO] - Client connected");
                System.out.println("[INFO] - Thread Start..");
                new Thread(new ThreadServer(client)).start();
                System.out.println("[INFO] - Thread running");
            }
            server.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
