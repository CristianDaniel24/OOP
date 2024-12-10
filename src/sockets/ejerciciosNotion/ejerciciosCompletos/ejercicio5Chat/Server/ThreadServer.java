package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio5Chat.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadServer implements Runnable {
    private final Socket client;
    private final DataInputStream in;
    private final DataOutputStream out;
    private String nameUser;

    public ThreadServer(Socket client) {
        this.client = client;
        try {
            this.in = new DataInputStream(client.getInputStream());
            this.out = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("[INFO] - Client connected " + this.client.getRemoteSocketAddress());
            boolean exit = false;
            //Se recibe el nombre del cliente
            this.nameUser = in.readUTF();
            while (!exit) {
                System.out.println("\n[INFO] - Name user to send message: " + this.nameUser);
                //Se recibe el mensaje del cliente
                String messageClient = in.readUTF();
                System.out.println("[INFO] - Message to client: " + messageClient);
                Server.sendMessage(this.nameUser, messageClient, this);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void messageForClients(String nameUser, String messageClient) {
        //Se le envia el mensaje con el formato al cliente
        try {
            String messageForClients = String.format(String.format("Message of %s%n👽: %s", nameUser, messageClient));
            out.writeUTF(messageForClients);
        } catch (IOException e) {
            Server.SERVERS_CLIENTS.remove(this);
            System.out.println("[INFO] - Client disconnected" + this.client.getRemoteSocketAddress());
            this.closeAll();
            throw new RuntimeException(e);
        }
    }

    public void closeAll() {
        try {
            if (this.in != null) {
                this.in.close();
            }
            if (this.out != null) {
                this.out.close();
            }
            if (this.client != null) {
                this.client.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
