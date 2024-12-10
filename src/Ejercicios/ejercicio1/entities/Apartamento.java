package Ejercicios.ejercicio1.entities;

public class Apartamento extends Vivienda {
    private String disenio;
    private Double valor;

    public Apartamento(String nombrePropietario,int edad,String disenio,Double valor){
        super(nombrePropietario,edad);
        this.disenio = disenio;
        this.valor = valor;
    }

    @Override
    public void detalles(){
        System.out.println("Departamento:"+
                "\nDatos sobre el propietario"+
                "\nNombre: "+nombrePropietario+
                "\nEdad: "+edad+
                "\nDiseño: "+disenio+
                "\nValor: "+valor);
    }
}
