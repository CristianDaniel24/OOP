package sockets.ejerciciosNotion.ejerciciosCompletos.ejercicio4.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        new ThreadHandler(reader);
    }
}
