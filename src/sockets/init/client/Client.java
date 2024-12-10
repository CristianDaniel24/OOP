package sockets.init.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            System.out.println("Connected to: " + socket.getRemoteSocketAddress());

            //Salida
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Greeting from the client");

            //Entrada
            DataInputStream in = new DataInputStream(socket.getInputStream());
            System.out.println("Message from the server: " + in.readUTF());
            socket.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
