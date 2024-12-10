
package herencia.ejercicio3;

import herencia.ejercicio3.entities.Estudiante;
import herencia.ejercicio3.entities.Persona;
import herencia.ejercicio3.entities.Profesor;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = {
                new Persona("Lucas", 26),
                new Profesor("Charlie", 24, "Naturales"),
                new Persona("Charlie", 30),
                new Estudiante("Juan", 17, 11),
                new Estudiante("Martin", 15, 7)
        };
        for (Persona persona : personas){
            persona.detallesPersona();
        }
    }
}