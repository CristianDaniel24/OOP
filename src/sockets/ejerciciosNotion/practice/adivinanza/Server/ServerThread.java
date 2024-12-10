package sockets.ejerciciosNotion.practice.adivinanza.Server;

import sockets.ejerciciosNotion.practice.adivinanza.constants.Constants;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.LinkedList;
import java.util.List;

public class ServerThread implements Runnable {

    private final int randomNumber;
    private final DataInputStream in;
    private final DataOutputStream out;
    private final List<Integer> logs;
    private String nameClient;
    private Socket client;
    private int numberClient;

    public ServerThread(Socket client, int randomNumber) {
        this.client = client;
        this.randomNumber = randomNumber;
        this.logs = new LinkedList<>();
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
            System.out.println("[INFO] - Random Number: " + this.randomNumber);
            this.nameClient = in.readUTF();
            System.out.println("[INFO] - Name client: " + nameClient + "\n");
            while (client.isBound()) {
                recibedClient();
                boolean found = validNumber();
                if (found) {
                    System.out.println("[INFO] - The client: " + this.nameClient + " win!!");
                    File file = new File(Constants.SERVER_PATH.concat("Text.txt"));
                    createFile();
                    transmitFile(file);
                    out.writeUTF("won");
                    Server.sendMessage(this.nameClient, this);
                }
            }
        } catch (IOException e) {
            closeAll();
            System.out.println("[ERROR] - Client disconnected");
        }
    }

    public void recibedClient() {
        try {
            this.numberClient = this.in.readInt();
            System.out.println("[INFO] - Number client: " + this.numberClient);
            this.logs.add(numberClient);
        } catch (SocketException e) {
            System.out.println("[ERROR] - Client disconnected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean validNumber() {
        boolean found = false;
        try {
            if (numberClient > randomNumber) {
                System.out.println("[INFO] - El numero es menor");
                this.out.writeUTF("El numero es menor");
            } else if (numberClient < randomNumber) {
                System.out.println("[INFO] - EL numero es mayor");
                this.out.writeUTF("El numero es mayor");
            } else {
                System.out.println("\n[INFO] - Number correct");
                this.out.writeUTF("correct");
                found = true;
            }
        } catch (SocketException e) {
            System.out.println("[ERROR] - Client disconnected");
            closeAll();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return found;
    }

    public void sendMessageLosers(String nameClient) {
        try {
            String messageLosers = String.format("User: %s  You lost =(", nameClient);
            out.writeUTF(messageLosers);
        } catch (IOException e) {
            Server.CLIENTS_CONNECTED.remove(this);
            System.out.println("[INFO] - Client disconnected " + this.client.getRemoteSocketAddress());
            this.closeAll();
            throw new RuntimeException(e);
        }
    }

    public void sendMessageWinner(String nameClient) {
        try {
            String messageLosers = String.format("User: %s  You Won!! =)", nameClient);
            out.writeUTF(messageLosers);
        } catch (IOException e) {
            Server.CLIENTS_CONNECTED.remove(this);
            System.out.println("[INFO] - Client disconnected " + this.client.getRemoteSocketAddress());
            this.closeAll();
            throw new RuntimeException(e);
        }
    }

    public void createFile() throws IOException {
        File file = new File(Constants.SERVER_PATH.concat("Text.txt"));
        boolean validFile = file.exists() && !file.isDirectory();
        if (!validFile) {
            System.out.println("File doesn't exits, creating file..");
            validFile = file.createNewFile();
        }
        if (validFile) {
            this.out.writeLong(file.length());
            System.out.println("[INFO] - Writing logs..");
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(Constants.SERVER_PATH.concat("Text.txt")));
                writer.write("User: " + this.nameClient + "\n");
                writer.write("The numbers entered were: \n");
                this.logs.forEach(num -> {
                    try {
                        writer.write(num + System.lineSeparator());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Invalid file!");
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
        System.out.println("[INFO] - File sent");
    }

    public void closeAll() {
        try {
            if (this.out != null) {
                this.out.close();
            }
            if (this.in != null) {
                this.in.close();
            }
            if (this.client != null) {
                this.client.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
