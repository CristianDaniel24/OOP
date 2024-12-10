package parte1;

public class Animales {
    //Herencia: Crear nuevas clases a partir de clases existentes. La clase nueva (subclase) hereda atributos y métodos
    //de la clase existente (superclase).
    // Superclase
    class Animal {
        void comer() {
            System.out.println("El animal está comiendo...");
        }
    }

    // Subclase
    class Perro extends Animal {
        void ladrar() {
            System.out.println("El perro está ladrando...");
        }
    }

}
