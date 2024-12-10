package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio4.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadHandler {
    private final BufferedReader reader;
    private DataInputStream in;
    private DataOutputStream out;

    public ThreadHandler(BufferedReader reader) {
        this.reader = reader;
        this.connect();
    }

    public void connect() {
        try (Socket server = new Socket("127.1.1.0", 8080)) {
            this.in = new DataInputStream(server.getInputStream());
            this.out = new DataOutputStream(server.getOutputStream());

            while (server.isConnected()) {
                handleAccess(false);
            }
        } catch (IOException e) {
            System.out.println("[ERROR] - Server disconnected");
        }
    }

    public void handleAccess(boolean skip) {
        try {
            if (skip || in.readBoolean()) {
                //Se lee la entrada del usuario
                System.out.println("Enter the text:");
                out.writeUTF(reader.readLine());
                evaluateResult();
            } else {
                handleAccess(false);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void evaluateResult() throws IOException {
        boolean hasResult = this.in.readBoolean();
        if (hasResult) {
            System.out.println("\nText final:");
            System.out.println(in.readUTF());
            handleAccess(true);
        } else {
            System.out.println(in.readUTF());
            evaluateResult();
        }

    }
}
