package herencia.ejercicio2.entities;

public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, Double salario, String lenguajeProgramacion){
        super(nombre, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    @Override
    public void detallesEmpleado() {
        super.detallesEmpleado();
        System.out.println("\nEl lenguaje de programacion es:");
        System.out.println(this.lenguajeProgramacion);
    }
        @Override
        public Double calcularBonus() {
            Double porcentaje = this.getSalario() + getSalario() * 0.15;
            return porcentaje;
        }
    }