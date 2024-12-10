package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio4.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Server {
    public static final List<ThreadServer> SERVERS_CLIENTS = new LinkedList<>();

    public static void main(String[] args) {
        final int port = 8080;
        try (ServerSocket server = new ServerSocket(port);
             ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            System.out.println("[INFO] - Listening in port: " + port);

            while (server.isBound()) {
                Socket client = server.accept();
                ThreadServer threadServer = new ThreadServer(client);
                SERVERS_CLIENTS.add(threadServer);
                evaluateTransmission();
                executorService.execute(threadServer);
            }
            executorService.shutdownNow();
            server.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static void evaluateTransmission() {
        System.out.println("[INFO] - Clients connected " + SERVERS_CLIENTS.size());
        if (SERVERS_CLIENTS.size() == 2) {
            SERVERS_CLIENTS.forEach(ThreadServer::sendStartMessage);
        }
    }

    public synchronized static void evaluateBroadcast(ThreadServer sender) {
        long validValue = SERVERS_CLIENTS.stream().map(ThreadServer::getText).filter(Objects::nonNull).count();

        if (validValue == 2 && SERVERS_CLIENTS.size() == 2) {
            String textFinal = SERVERS_CLIENTS.stream().map(ThreadServer::getText).collect(Collectors.joining(" | "));

            SERVERS_CLIENTS.forEach(client -> client.sendText(textFinal));
        } else {
            SERVERS_CLIENTS.forEach(ThreadServer::sendWaitingMessage);
        }
    }
}
