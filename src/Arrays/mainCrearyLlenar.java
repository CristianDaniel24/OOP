package Arrays;

public class mainCrearyLlenar {
        public static void main(String[] args) {
            Persona[] personas = new Persona[5];

            personas[0] = new Persona("Jose", 30);
            personas[1] = new Persona("Joaquin", 25);
            personas[2] = new Persona("Charlie", 28);
            personas[3] = new Persona("David", 35);
            personas[4] = new Persona("Lucas", 22);

            for (Persona persona : personas) {
                System.out.println("Nombre: " + persona.nombre + "\nEdad: " + persona.edad);
            }
        }
    }