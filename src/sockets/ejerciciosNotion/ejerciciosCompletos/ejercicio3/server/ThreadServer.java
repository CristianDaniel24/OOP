package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio3.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

import static sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio3.server.Server.*;

public class ThreadServer extends Thread {
    private final Socket client;

    public ThreadServer(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (DataInputStream in = new DataInputStream(client.getInputStream());
             DataOutputStream out = new DataOutputStream(client.getOutputStream());
             //ObjectInputStream inObjec = new ObjectInputStream(client.getInputStream());
             //ObjectOutputStream outObjec = new ObjectOutputStream(client.getOutputStream());
        ) {
            System.out.println(in.readUTF());
            while (client.isConnected()) {
                if (clientsConnected.size() % 2 == 0) {
                    int numberRecibed = in.readInt();
                    System.out.printf("Number %d%n", numberRecibed);
                    //Se recibe y se asigna el valor a alguna de las dos variables
                    if (numberClient1 == null) {
                        numberClient1 = numberRecibed;
                    } else {
                        numberClient2 = numberRecibed;
                    }
                    //Condicion para esperar que las dos variables esten llenas
                    if (numberClient1 != null && numberClient2 != null) {
                        int result = multiplicacion();
                        out.writeInt(result);
                    } else {
                        System.out.println("Waiting second number..");
                    }
                } else {
                    System.out.println(in.readUTF());
                }
            }
        } catch (SocketException e) {
            //Se elimina un usuario de la lista constante que esta en el Server
            clientsConnected.remove(client);
            System.out.println("[INFO] - Client disconnected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int multiplicacion() {
        return numberClient1 * numberClient2;
    }
}
