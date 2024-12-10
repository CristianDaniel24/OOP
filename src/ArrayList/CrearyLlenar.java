package ArrayList;

import java.util.ArrayList;

public class CrearyLlenar{
        public static void main(String[] args) {
            ArrayList<ArrayListPadre> personas = new ArrayList<>();
            personas.add(new ArrayListPadre("Jose", 30));
            personas.add(new ArrayListPadre("Joaquin", 25));
            personas.add(new ArrayListPadre("Charlie", 28));
            personas.add(new ArrayListPadre("David", 35));
            personas.add(new ArrayListPadre("Lucas", 22));
            for (ArrayListPadre persona : personas) {
                System.out.println("Nombre: " + persona.nombre + ", Edad: " + persona.edad);
            }
        }
    }