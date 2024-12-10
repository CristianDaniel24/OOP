package Hasmap.Ejercicio2;

public class Employee {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    public Employee(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmployee " + "id:" + id + ", nombre:'" + nombre + '\'' + ", puesto:'" + puesto + '\'' + ", salario:" + salario;
    }
}
