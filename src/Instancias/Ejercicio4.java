package Instancias;

public class Ejercicio4 {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote de la mancha", true);
        disponibilidad(libro);
    }

    public static void disponibilidad(Libro libro) {
        if (libro.disponible) {
            System.out.println(libro.titulo + " esta disponible =)");
        } else {
            System.out.println(libro.titulo + " no esta disponible =(");
        }
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
