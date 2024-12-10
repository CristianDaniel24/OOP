package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio3.client;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (Socket socket = new Socket("127.0.0.1", 8080)) {
            try (DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                 DataInputStream in = new DataInputStream(socket.getInputStream())) {
                boolean start = in.readBoolean();
                if (start) {
                    //TODO: como se cual cliente se conecto
                    System.out.println("Connected");
                    System.out.println("Enter the number:");
                    int number = Integer.parseInt(reader.readLine());
                    //Se envian el numero al ThreadServer
                    out.writeInt(number);
                    //Esperar la respuesta del servidor
                    //Se imprime el resultado
                } else {
                    out.writeUTF("Waiting for second user..");
                }
            } catch (SocketException e) {
                System.out.println("[INFO] - Client disconnected");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //Si no se pudo pasar todo lo de ThreadClient aqui
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
