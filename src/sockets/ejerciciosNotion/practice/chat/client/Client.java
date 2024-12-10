package sockets.ejerciciosNotion.practice.chat.client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try (Socket client = new Socket("127.0.0.1", 8080)) {
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            System.out.println("\nEnter your name:");
            String nameUser = reader.readLine();
            System.out.printf("WELCOME!! %s", nameUser);
            out.writeUTF(nameUser);

            Thread thread = new Thread(new ThreadClient(client));
            thread.start();
            System.out.println("\nEnter 'exit' for exit");
            boolean exit = false;
            while (!exit) {
                System.out.println("\n👾 Enter your message:");
                String message = reader.readLine();
                out.writeUTF(message);

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Exit..");
                    exit = true;
                }
            }
            client.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
