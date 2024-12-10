package herencia.ejercicio2.entities;

public class Empleado {
    private String nombre;
    private Double salario;

    public Empleado(String nombre, Double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    public void detallesEmpleado() {
        System.out.println("El nombre es:");
        System.out.println(this.nombre);
        System.out.println("\nEl salario base es: "+this.salario);
        System.out.println("El salario mas el bono es: "+this.calcularBonus());
    }
    public double getSalario() {
        return this.salario;
    }
    public Double calcularBonus(){
        Double porcentaje = this.salario * 10;
        return porcentaje;
    }
}