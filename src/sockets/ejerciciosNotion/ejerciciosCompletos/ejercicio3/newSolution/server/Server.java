package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio3.newSolution.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static final List<ThreadServer> SERVERS_CLIENTS = new LinkedList<>();

    public static void main(String[] args) {
        final int port = 8080;

        try (ServerSocket server = new ServerSocket(port);
             ExecutorService threadPool = Executors.newFixedThreadPool(2)
        ) {
            System.out.println("[INFO] - Server listening on port " + port);
            while (server.isBound()) {
                Socket client = server.accept();
                ThreadServer threadServer = new ThreadServer(client);
                SERVERS_CLIENTS.add(threadServer);
                evaluateBroadcastStar();
                threadPool.execute(threadServer);
            }
            threadPool.shutdownNow();
            server.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static void evaluateBroadcastStar() {
        System.out.println("[INFO] - Clients connected " + SERVERS_CLIENTS.size());
        if (SERVERS_CLIENTS.size() == 2) {
            SERVERS_CLIENTS.forEach(ThreadServer::sendStartMessage);
        }
    }

    public synchronized static void evaluateBroadcast(ThreadServer sender) {
        long validValue = SERVERS_CLIENTS.stream().map(ThreadServer::getNumber).filter(Objects::nonNull).count();

        if (validValue == 2L && SERVERS_CLIENTS.size() == 2) {
            int result = SERVERS_CLIENTS.stream().map(ThreadServer::getNumber).reduce((a, b) -> a * b).orElse(0);
            SERVERS_CLIENTS.forEach(client -> client.sendResult(result));
        } else {
            SERVERS_CLIENTS.forEach(ThreadServer::sendWaitingMessage);
        }
    }
}
