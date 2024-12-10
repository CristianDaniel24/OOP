package sockets.init.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is listening on port 8080..");

            Socket client = serverSocket.accept();
            System.out.println("Client connected");
            
            DataInputStream in = new DataInputStream(client.getInputStream());
            System.out.println("Message from client: " + in.readUTF());

            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("Greeting from the server");

            client.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
