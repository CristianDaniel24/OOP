package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio3.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    //Se crean ambas variables estaticas para almacenar la de cada cliente
    public static Integer numberClient1;
    public static Integer numberClient2;
    //Lista estatica de ThreadServer con clientes conectados
    public static List<ThreadServer> clientsConnected = new LinkedList<>();
    //Asignarle una variable a cada usuario conectado
    public static Map<Integer, ThreadServer> usuariosMap = new HashMap<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            while (serverSocket.isBound()) {
                Socket client = serverSocket.accept();

                DataOutputStream out = new DataOutputStream(client.getOutputStream());
                ThreadServer threadService = new ThreadServer(client);
                executorService.execute(threadService);
                //Hasta que este el ThreadServer definido se agrega a la lista de clientes conectados

                if (clientsConnected.isEmpty()) {
                    System.out.println("[INFO] - Waiting users..");
                } else {
                    if (clientsConnected.size() % 2 == 0) {
                        //Si es par continua con el proceso
                        //Cuando esten los dos clientes conectados en la lista envia la señal al ThreadClient para que inicie el programa
                        out.writeBoolean(true);
                        for (int i = 0; i < clientsConnected.size(); i++) {
                            usuariosMap.put(i + 1, clientsConnected.get(i));
                        }
                    } else {
                        //Si es impar no continua
                        out.writeBoolean(false);
                        System.out.println("[INFO] - Waiting users..");
                    }
                }
            }
            executorService.shutdownNow();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
