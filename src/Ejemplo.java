
public class Ejemplo {

        private String nombre;
        private int edad;
        private String ciudad;

        public Ejemplo(String nombre, int edad, String ciudad){
            this.nombre = nombre;
            this.edad = edad;
            this.ciudad = ciudad;
        }

        public void detalles(){
            System.out.println("El estudiante se llama "+nombre);
            System.out.println(this.nombre+" tiene "+this.edad+ " años");
            System.out.println(nombre+" es de "+ciudad);
        }
    }