package sockets.ejerciciosNotion.practice.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadServer implements Runnable {

    private final Socket client;
    private final DataInputStream in;
    private final DataOutputStream out;

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
            String name = in.readUTF();
            System.out.println("[INFO] - Name of client is: " + name);
            while (client.isConnected()) {
                String message = in.readUTF();
                Server.sendMessage(name, message, this);
            }
        } catch (IOException e) {
            Server.LIST_CLIENTS.remove(this);
            this.closeAll();
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(String name, String message) {
        try {
            String messageFinal = String.format("User %s%nMessage: %s", name, message);
            out.writeUTF(messageFinal);
        } catch (IOException e) {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
