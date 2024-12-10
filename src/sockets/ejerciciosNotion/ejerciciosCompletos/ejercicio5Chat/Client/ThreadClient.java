package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio5Chat.Client;

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
        this.readSendMessage();
    }

    public void readSendMessage() {
        try {
            //Lee el mensaje del servidor
            System.out.println(in.readUTF());
            //Se referencia para que siga leyendo continuamente
            this.readSendMessage();
        } catch (IOException e) {
            this.closeAll();
            throw new RuntimeException(e);
        }
    }

    public void closeAll() {
        try {
            if (this.in != null) {
                this.in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
