package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicios6Files.server;

import sockets.ejerciciosNotion.ejerciciosCompletos.ejercicios6Files.constants.Constants;

import java.io.*;
import java.net.Socket;

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
            System.out.println("[INFO] - Clien connected " + client.getRemoteSocketAddress());
            this.fileName = in.readUTF();
            System.out.println("[INFO] - File requested: " + this.fileName);
            File file = new File(Constants.SERVER_PATH + this.fileName);

            if (file.exists() && !file.isDirectory()) {
                this.out.writeUTF("File found!");
                this.out.writeLong(file.length());
                this.transmitFile(file);
            } else {
                this.out.writeUTF("File doesn't exists!");
            }
            System.out.println("[INFO] - Request finished\n");
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] - File not found " + this.fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void transmitFile(File file) throws IOException {

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
