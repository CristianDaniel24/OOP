
public class EjemploParte2 extends Ejemplo {

        private String curso = "once";

        public EjemploParte2(String nombre, int edad, String ciudad){
            super(nombre,edad,ciudad);
        }

        public void detalles(){
            super.detalles();
            System.out.println("El estudiante es del curso: "+curso);
        }
    }