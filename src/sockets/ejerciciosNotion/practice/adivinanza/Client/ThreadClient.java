package sockets.ejerciciosNotion.practice.adivinanza.Client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadClient implements Runnable {

    private final DataInputStream in;
    private Socket client;

    public ThreadClient(Socket client, DataInputStream in) {
        this.client = client;
        this.in = in;
    }

    @Override
    public void run() {
        try {
            while (client.isBound()) {
                String found = in.readUTF();
                if (found.equals("won")) {
                    System.out.println(in.readUTF());
                } else {
                    System.out.println(in.readUTF());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
