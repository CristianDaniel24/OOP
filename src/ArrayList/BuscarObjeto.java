package ArrayList;

import java.util.ArrayList;

public class BuscarObjeto {
    public static void main(String[] args) {
        ArrayList<ArrayListPadre> buscarPersona = new ArrayList<>();

        buscarPersona.add(new ArrayListPadre("Jose", 30));
        buscarPersona.add(new ArrayListPadre("Joaquin", 25));
        buscarPersona.add(new ArrayListPadre("Charlie", 28));
        buscarPersona.add(new ArrayListPadre("David", 35));
        buscarPersona.add(new ArrayListPadre("Lucas", 22));

        String nombreBuscado = "Lucas";
        for (ArrayListPadre persona : buscarPersona) {
            if (persona.nombre.equals(nombreBuscado)) {
                System.out.println("El nombre es " + nombreBuscado + " y su edad es: " + persona.edad);
                return;
            }
        }
    }
}