package sockets.ejerciciosNotion.ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class ThreadSocket extends Thread {
    private final Socket clientSocket;

    public ThreadSocket(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (DataInputStream in = new DataInputStream(clientSocket.getInputStream());
             DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream())) {
            boolean exit = false;
            System.out.println("[INFO] - Client connected");
            while (!exit) {
                String inputClient = in.readUTF();
                if (inputClient.equalsIgnoreCase("EXIT")) {
                    System.out.println("[INFO] - Client disconnected");
                    exit = true; //Se acaba el bucle para el cliente
                } else {
                    out.writeUTF(inputClient);
                    System.out.println("[INFO] - Message sent");
                }
            }
        } catch (SocketException e) {
            System.out.println("[INFO] - Client disconnected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
