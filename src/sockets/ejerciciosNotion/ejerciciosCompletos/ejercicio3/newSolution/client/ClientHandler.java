package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio3.newSolution.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private final BufferedReader reader;
    private DataInputStream in;
    private DataOutputStream out;

    public ClientHandler(BufferedReader reader) {
        this.reader = reader;
        this.connect();
    }

    public void connect() {
        try (Socket server = new Socket("127.0.0.1", 8080)) {
            this.in = new DataInputStream(server.getInputStream());
            this.out = new DataOutputStream(server.getOutputStream());

            while (server.isConnected()) {
                handleAccess(false);
            }
        } catch (IOException e) {
            System.out.println("[ERROR] - Server disconnected");
        }
    }

    private void handleAccess(boolean skipInitialization) {
        try {
            if (skipInitialization || in.readBoolean()) {
                System.out.println("Enter the number:");
                out.writeInt(Integer.parseInt(reader.readLine()));
                evaluateResult();
            } else {
                handleAccess(false);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void evaluateResult() throws IOException {
        boolean hasResult = this.in.readBoolean();
        if (hasResult) {
            System.out.println("\nResult");
            System.out.println(in.readInt());
            System.out.println("***");
            handleAccess(true);
        } else {
            System.out.println(in.readUTF());
            evaluateResult();
        }
    }
}
