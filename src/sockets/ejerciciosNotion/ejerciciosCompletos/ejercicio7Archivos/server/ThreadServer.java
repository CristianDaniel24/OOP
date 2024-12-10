package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio7Archivos.server;

import sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio7Archivos.constants.Constants;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class ThreadServer implements Runnable {

    private final Socket client;
    private final DataInputStream in;
    private final DataOutputStream out;
    private String fileName;

    public ThreadServer(Socket client) {
        this.client = client;
        try {
            this.in = new DataInputStream(client.getInputStream());
            this.out = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("[INFO] - Running thread");
            this.fileName = in.readUTF();

            File file = new File(Constants.SERVER_PATH.concat(this.fileName));

            if (file.exists() && !file.isDirectory()) {
                while (client.isBound()) {
                    String option = in.readUTF();
                    System.out.println("[INFO] - Option client: " + option);
                    this.out.writeLong(file.length());
                    switch (option) {
                        case "image":
                            System.out.println("[INFO] - Searching Image");
                            transmitFile(file);
                            break;
                        case "song":
                            System.out.println("[INFO] - Searching Song");
                            transmitFile(file);
                            break;
                        case "video":
                            System.out.println("[INFO] - Searching Video");
                            transmitFile(file);
                            break;
                        default:
                            System.out.println("[INFO] - Input of client is incorrect");
                    }
                }
            } else {
                System.out.println("[INFO] - File doesn't exists");
            }
        } catch (SocketException e) {
            System.out.println("[ERROR] - Client disconnected");
        } catch (EOFException e) {
            System.out.println("[ERROR] - Client disconnected");
            closeAll();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void transmitFile(File file) throws IOException {
        System.out.println("[INFO] - transmitting..");

        FileInputStream inFile = new FileInputStream(file);
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = inFile.read(buffer)) != -1) {
            this.out.write(buffer, 0, bytesRead);
        }
        inFile.close();
        this.closeAll();
        System.out.println("[INFO] - File sent");
    }

    public void closeAll() {
        try {
            if (this.in != null) {
                this.in.close();
            }

            if (this.out != null) {
                this.out.close();
            }

            if (this.client != null) {
                this.client.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
