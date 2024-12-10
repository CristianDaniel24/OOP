package ArrayList;

import java.util.ArrayList;

public class Actualizar {
    public static void main(String[] args) {
        ArrayList<ArrayListPadre> Actualizar = new ArrayList<>();

        Actualizar.add(new ArrayListPadre("Jose", 30));
        Actualizar.add(new ArrayListPadre("Joaquin", 25));
        Actualizar.add(new ArrayListPadre("Charlie", 28));
        Actualizar.add(new ArrayListPadre("David", 35));
        Actualizar.add(new ArrayListPadre("Lucas", 22));

        String nombreBuscado = "Joaquin";
        int nuevaEdad = 32;
        for (ArrayListPadre persona : Actualizar) {
            if (persona.nombre.equals(nombreBuscado)) {
                persona.edad = nuevaEdad;
                System.out.println("La nueva edad de " + nombreBuscado + " es: " + persona.edad);
            }
        }
    }
}