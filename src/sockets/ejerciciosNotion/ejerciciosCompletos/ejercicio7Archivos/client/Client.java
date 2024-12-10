package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio7Archivos.client;

import sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio7Archivos.constants.Constants;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket client = new Socket("127.0.0.1", 8080);
             DataOutputStream out = new DataOutputStream(client.getOutputStream());
             DataInputStream in = new DataInputStream(client.getInputStream())) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            boolean exit = false;
            while (!exit) {
                System.out.println("\nMenu");
                System.out.println("1. Request image");
                System.out.println("2. Request song");
                System.out.println("3. Request video");
                System.out.println("4. Exit");
                System.out.println("Enter the option:");
                int opton = Integer.parseInt(reader.readLine());
                switch (opton) {
                    case 1:
                        System.out.println("Image available");
                        System.out.println("E2.png");
                        System.out.println("\nEnter the name to file:");
                        String nameImage = reader.readLine();
                        out.writeUTF(nameImage);
                        out.writeUTF("image");
                        processFile(nameImage, in);
                        break;
                    case 2:
                        System.out.println("Song available");
                        System.out.println("Lavish top .mp3");
                        System.out.println("\nEnter the name to file:");
                        String nameSong = reader.readLine();
                        out.writeUTF(nameSong);
                        out.writeUTF("song");
                        processFile(nameSong, in);
                        break;
                    case 3:
                        System.out.println("Video available");
                        System.out.println("Paladin Strait top.mp4");
                        System.out.println("\nEnter the name to file:");
                        String nameVideo = reader.readLine();
                        out.writeUTF(nameVideo);
                        out.writeUTF("video");
                        processFile(nameVideo, in);
                        break;
                    case 4:
                        System.out.println("Exit..");
                        exit = true;
                        break;
                    default:
                        System.out.println("The option is invalid");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter the number");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void processFile(String fileName, DataInputStream in) throws IOException {
        File file = new File(Constants.CLIENT_PATH.concat(fileName));
        boolean validFile = file.exists() && !file.isDirectory();
        if (!validFile) {
            System.out.println("File doesn't exits, creating file..");
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
