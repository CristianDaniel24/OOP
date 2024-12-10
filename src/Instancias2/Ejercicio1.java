package Instancias2;

public class Ejercicio1 {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote de la Mancha", true);

        // Se usa el retorno del metodo para realizar una accion
        boolean estaDisponible = disponibilidad(libro);

        if (estaDisponible) {
            System.out.println(libro.titulo + " esta disponible =)");
        } else {
            System.out.println(libro.titulo + " no esta disponible =(");
        }
    }

    public static boolean disponibilidad(Libro libro) {
        return libro.disponible;
    }

    public static class Libro {
        String titulo;
        boolean disponible;

        Libro(String titulo, boolean disponible) {
            this.titulo = titulo;
            this.disponible = disponible;
        }
    }
}