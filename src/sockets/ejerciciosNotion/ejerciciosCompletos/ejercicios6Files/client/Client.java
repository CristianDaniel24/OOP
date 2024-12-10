package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicios6Files.client;

import sockets.ejerciciosNotion.ejerciciosCompletos.ejercicios6Files.constants.Constants;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name to file:");
            requestFile(reader.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void requestFile(String fileName) throws IOException {
        try (Socket client = new Socket("127.0.0.1", 8080);
             DataInputStream in = new DataInputStream(client.getInputStream());
             DataOutputStream out = new DataOutputStream(client.getOutputStream())) {
            out.writeUTF(fileName);
            String result = in.readUTF();
            if (result.equals("File found!")) {
                processFile(fileName, in);
            } else {
                System.out.println("File not found");
            }
            in.close();
            out.close();
            client.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void processFile(String fileName, DataInputStream in) throws IOException {
        File file = new File(Constants.CLIENT_PATH.concat(fileName));
        boolean validFile = file.exists() && !file.isDirectory();
        if (!validFile) {
            System.out.println("File doesn't exist, creating file...");
            validFile = file.createNewFile();
        }
        if (validFile) {
            System.out.println("Processing file");
            int bytesRead;
            byte[] buffer = new byte[4096];
            long fileSize = in.readLong();
            long totalBytesRead = 0L;
            FileOutputStream outFile = new FileOutputStream(file);
            while (totalBytesRead < fileSize && (bytesRead = in.read(buffer)) != -1) {
                outFile.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
            }
            outFile.close();
            System.out.println("File processed!");

        } else {
            System.out.println("Invalid file!");
        }
    }
}
