package parte1;

public class Mascota {
    //Polimorfismo: Capacidad de un objeto de tomar muchas formas. Permite usar una interfaz o una superclase
    // para referirse a objetos de diferentes subclases.
    class Animal {
        void hacerSonido() {
            System.out.println("El animal hace un sonido");
        }
    }

    class Perro extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("El perro ladra");
        }
    }

    class Gato extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("El gato maúlla");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal miAnimal;

            //miAnimal = new Perro();
            //miAnimal.hacerSonido();  // Salida: El perro ladra

            //miAnimal = new Gato();
            //miAnimal.hacerSonido();  // Salida: El gato maúlla
        }
    }

}
