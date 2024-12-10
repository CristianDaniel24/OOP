package sockets.ejerciciosNotion.practice.adivinanza.Server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static final List<ServerThread> CLIENTS_CONNECTED = new LinkedList<>();

    public static void main(String[] args) {
        final int port = 8080;
        int randomNumber = (int) (Math.random() * 100) + 1;

        try (ServerSocket server = new ServerSocket(port)) {
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            System.out.println("[INFO] - Listening in port " + port);
            while (server.isBound()) {
                Socket client = server.accept();
                ServerThread serverThread = new ServerThread(client, randomNumber);
                CLIENTS_CONNECTED.add(serverThread);
                executorService.execute(serverThread);
            }
            server.close();
            //Terminar el thread y el server cuando gane el cliente
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static void sendMessage(String name, ServerThread sender) {
        CLIENTS_CONNECTED.forEach(client -> {
            if (client != sender) {
                client.sendMessageLosers(name);
            } else {
                client.sendMessageWinner(name);
            }
        });
    }
}
