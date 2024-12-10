package parte1;

public class Coche {
        // Atributos
        private String color;
        private String marca;
        private int year;
        //Constructor
        public Coche(String color,String marca,int year){
        this.color = color;
        this.marca = marca;
        this.year = year;
        }
        public void imprimir(){
        System.out.println(color);
        System.out.println(marca);
        System.out.println(year);
        }
        // Métodos
        void arrancar() {
            System.out.println("El coche está arrancando...");
        }

        void frenar() {
            System.out.println("El coche está frenando...");
        }
    }