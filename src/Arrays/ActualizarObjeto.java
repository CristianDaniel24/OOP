package Arrays;

public class ActualizarObjeto {
    public static void main(String[] args) {
        Persona[] Actualizar =  new Persona[5];{
            Actualizar[0] = new Persona("Jose", 30);
            Actualizar[1] = new Persona("Joaquin", 25);
            Actualizar[2] = new Persona("Charlie", 28);
            Actualizar[3] = new Persona("David", 35);
            Actualizar[4] = new Persona("Lucas", 22);
        }
        String nombreBuscado = "Jose";
        int nuevaEdad = 35;

        for (Persona persona : Actualizar) {
            if (persona.nombre.equals(nombreBuscado)) {
                persona.edad = nuevaEdad;
                System.out.println("La nueva edad de " + nombreBuscado + " es: " + persona.edad);
                return;
            }

        }
    }
}