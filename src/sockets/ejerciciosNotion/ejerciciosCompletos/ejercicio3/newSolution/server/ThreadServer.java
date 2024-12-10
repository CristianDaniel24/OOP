package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio3.newSolution.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadServer implements Runnable {

    private final Socket socket;
    private final DataInputStream in;
    private final DataOutputStream out;
    private Integer number;

    public ThreadServer(Socket socket) {
        this.socket = socket;
        try {
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void sendResult(int result) {
        try {
            this.out.writeBoolean(true);
            this.out.writeInt(result);
            this.number = null;
        } catch (IOException e) {
            System.out.println("[ERROR] - Error sending result to client " + this.socket.getRemoteSocketAddress());
        }
    }

    public void sendWaitingMessage() {
        try {
            this.out.writeBoolean(false);
            this.out.writeUTF("Waiting for another user!");
        } catch (IOException e) {
            System.out.println("[ERROR] - Error sending waiting message to client " + this.socket.getRemoteSocketAddress());
        }
    }

    @Override
    public void run() {
        System.out.println("[INFO] - Client connected " + this.socket.getRemoteSocketAddress());
        this.getClientNumber();
    }

    public void getClientNumber() {
        System.out.println("[INFO] - getClientNumber " + this.socket.getRemoteSocketAddress());
        try {
            this.number = in.readInt();
            System.out.println("[INFO] - Number from client " + this.number);
            Server.evaluateBroadcast(this);
            //Con esto se llama al metodo asi mismo, y asi se puede seguir pidiendo los numeros
            this.getClientNumber();
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
