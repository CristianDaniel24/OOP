package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio7Archivos.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {
            if (server.isBound()) {
                Socket client = server.accept();
                System.out.println("[INFO] - Client connected");
                Thread thread = new Thread(new ThreadServer(client));
                thread.start();
            }
            server.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
