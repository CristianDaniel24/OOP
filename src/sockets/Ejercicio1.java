package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost"; // Direccion del servidor
        int port = 1234; // Puerto del servidor

        try (Socket socket = new Socket(hostname, port)) { // Conecta con el servidor
            System.out.println("Conectado al servidor");

            // Crear flujo de entrada para recibir datos del servidor
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Leer mensaje del servidor
            String message = reader.readLine();
            System.out.println("Mensaje del servidor: " + message);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
