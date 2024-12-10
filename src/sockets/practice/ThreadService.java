package sockets.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadService implements Runnable {
    private Socket clientSocket;

    public ThreadService(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true)) {
            String message;
            output.println("Bienvenido al servidor, escribe 'bye' para salir");

            // Leer mensajes del cliente
            while ((message = input.readLine()) != null) {
                System.out.println("Mensaje del cliente: " + message);

                if ("bye".equalsIgnoreCase(message)) {
                    output.println("Adios, cliente!");
                    break;
                }
                // Responder al cliente
                output.println("Servidor recibió: " + message);
            }
        } catch (IOException e) {
            System.err.println("Error manejando cliente: " + e.getMessage());
        } finally { //El codigo del finally siempre se ejecuta sin importar lo que pase con el try
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("No se pudo cerrar el socket del cliente: " + e.getMessage());
            }
        }
    }
}
