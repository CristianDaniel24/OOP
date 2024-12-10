package sockets.ejerciciosNotion.practice.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static final List<ThreadServer> LIST_CLIENTS = new LinkedList<>();

    public static void main(String[] args) {
        int port = 8080;
        try (ServerSocket server = new ServerSocket(port)) {

            ExecutorService thread = Executors.newFixedThreadPool(3);

            while (server.isBound()) {
                Socket client = server.accept();
                ThreadServer threadServer = new ThreadServer(client);
                System.out.println("[INFO] - Client connected");
                LIST_CLIENTS.add(threadServer);
                thread.execute(threadServer);
            }
            server.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static void sendMessage(String name, String message, ThreadServer sender) {
        LIST_CLIENTS.stream().filter(client -> client != sender)
                .forEach(client -> client.sendMessage(name, message));
    }
}
