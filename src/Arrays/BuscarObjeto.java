package Arrays;

public class BuscarObjeto {
        public static void main(String[] args) {
            Persona[] personasBuscadas = new Persona[5];

            personasBuscadas[0] = new Persona("Jose", 30);
            personasBuscadas[1] = new Persona("Joaquin", 25);
            personasBuscadas[2] = new Persona("Charlie", 28);
            personasBuscadas[3] = new Persona("David", 35);
            personasBuscadas[4] = new Persona("Lucas", 22);

            String nombreBuscado = "Charlie";
            for (Persona persona : personasBuscadas) {
                if (persona.nombre.equals(nombreBuscado)) {
                    System.out.println("La edad de " + nombreBuscado + " es: " + persona.edad);
                    return;
                }
            }
        }
    }