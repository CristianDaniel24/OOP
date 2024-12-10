package sockets.ejerciciosNotion.practice.adivinanza.Client;

import sockets.ejerciciosNotion.practice.adivinanza.constants.Constants;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try (Socket client = new Socket("127.0.0.10", 8080)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            DataInputStream in = new DataInputStream(client.getInputStream());

            System.out.println("Enter your name:");
            String nameClient = reader.readLine();
            out.writeUTF(nameClient);

            while (client.isBound()) {
                System.out.println("\nEnter the number:");
                int number = Integer.parseInt(reader.readLine());
                out.writeInt(number);
                boolean found = verifyNumber(in);
                if (found) {
                    try {
                        System.out.println("Congratulations you won!!");
                        recibedFile(in);
                        System.out.println("Recibided");
                        //Se puede crear un Thread mas para que verifique si alguien gano
                        Thread thread = new Thread(new ThreadClient(client, in));
                        thread.start();
                        //Este thread espera una señal y cuando gane el usuario le envia esa señal a ese Thread
                        thread.join();
                        client.close();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                //Cuando pierda el usuario tambien se cierra
            }
            //Cuando gane se cierra todo
            System.out.println("Fin");
            closeAll(out, in, reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean verifyNumber(DataInputStream in) {
        boolean found = false;
        try {
            String verify = in.readUTF();
            if (verify.equals("correct")) {
                System.out.println("\nThe number is correct!!");
                found = true;
            } else {
                System.out.println(verify);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return found;
    }

    public static void recibedFile(DataInputStream in) throws IOException {
        File file = new File(Constants.CLIENT_PATH.concat("Text.txt"));
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

    public static void closeAll(DataOutputStream out, DataInputStream in, BufferedReader reader) {
        try {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
