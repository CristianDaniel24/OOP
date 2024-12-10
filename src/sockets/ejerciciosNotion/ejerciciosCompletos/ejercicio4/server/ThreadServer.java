package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio4.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadServer implements Runnable {

    private final Socket socket;
    private final DataInputStream in;
    private final DataOutputStream out;
    private String text;

    public ThreadServer(Socket socket) {
        this.socket = socket;
        try {
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getText() {
        return text;
    }

    public void sendText(String textFinal) {
        try {
            this.out.writeBoolean(true);
            this.out.writeUTF(textFinal);
            this.text = null;
        } catch (IOException e) {
            System.out.println("[ERROR] - Error sending text final to client " + this.socket.getRemoteSocketAddress());
        }
    }

    public void sendWaitingMessage() {
        try {
            this.out.writeBoolean(false);
            this.out.writeUTF("Waiting for another user..");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        System.out.println("[INFO] - Client connected " + this.socket.getRemoteSocketAddress());
        this.getClientText();
    }

    public void getClientText() {
        System.out.println("[INFO] - getClientText " + this.socket.getRemoteSocketAddress());
        try {
            this.text = in.readUTF();
            System.out.println("[INFO] - Text from client: " + this.text);
            Server.evaluateBroadcast(this);
            this.getClientText();
        } catch (IOException e) {
            Server.SERVERS_CLIENTS.remove(this);
            System.out.println("[INFO] - Client disconnected" + this.socket.getRemoteSocketAddress());
            this.closeAll();
        }
    }

    public void sendStartMessage() {
        try {
            this.out.writeBoolean(true);
        } catch (IOException e) {
            System.out.println("[ERROR] - Error sending start message to client " + socket.getRemoteSocketAddress());
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
            if (this.socket != null) {
                this.socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
