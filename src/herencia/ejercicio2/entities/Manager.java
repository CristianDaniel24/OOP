package herencia.ejercicio2.entities;

public class Manager extends Empleado{
    private String departamento;

    public Manager(String nombre, Double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public void detallesEmpleado(){
        super.detallesEmpleado();
        System.out.println("\nLos detalles del departamento son:");
        System.out.println("El departamento es: "+this.departamento);
    }
    @Override
    public Double calcularBonus(){
            Double porcentaje = this.getSalario() + this.getSalario() * 0.2;
            return porcentaje;
    }
}