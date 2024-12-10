package Ejercicios.ejercicio3.entities;

public class Futbol extends Deportes{

    private int cantJugadores;
    private Double tiempoJuego;

    public Futbol(String nombreDeporte, int cantJugadores, Double tiempoJuego){
        super(nombreDeporte);
        this.cantJugadores = cantJugadores;
        this.tiempoJuego = tiempoJuego;
    }

    @Override
    public void detalles(){
        super.detalles();
        System.out.println("Nombre del deporte: "+nombreDeporte+
                "\nCantidad de jugadores: "+cantJugadores+
                "\nTiempo de juego: "+tiempoJuego);
    }
}
