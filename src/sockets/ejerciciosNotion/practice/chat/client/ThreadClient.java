package sockets.ejerciciosNotion.practice.chat.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadClient implements Runnable {

    private final DataInputStream in;

    public ThreadClient(Socket client) {
        try {
            this.in = new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        this.read();
    }

    public void read() {
        try {
            System.out.println(in.readUTF());
            this.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
