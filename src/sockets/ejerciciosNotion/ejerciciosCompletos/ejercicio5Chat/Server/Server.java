package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio5Chat.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static final List<ThreadServer> SERVERS_CLIENTS = new LinkedList<>();

    public static void main(String[] args) {
        final int port = 8080;
        try (ServerSocket server = new ServerSocket(port)) {
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            System.out.println("[INFO] - Listening in port: " + port);
            while (server.isBound()) {
                Socket client = server.accept();
                ThreadServer threadServer = new ThreadServer(client);
                SERVERS_CLIENTS.add(threadServer);
                executorService.execute(threadServer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static void sendMessage(String name, String messageClient, ThreadServer sender) {
        //Se envia el mensaje para cada cliente
        SERVERS_CLIENTS.stream().filter(client -> client != sender)
                .forEach(client -> client.messageForClients(name, messageClient));
    }
}
