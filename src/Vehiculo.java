package parte1;

public class Vehiculo {
    //Encapsulamiento: Esconder los detalles internos de un objeto y exponer solo lo necesario a través de métodos públicos.
        // Atributos privados
        private String color;
        private String marca;
        private int año;

        // Métodos públicos para acceder a los atributos
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public void arrancar() {
            System.out.println("El coche está arrancando...");
        }

        public void frenar() {
            System.out.println("El coche está frenando...");
        }
    }


