package Ejercicios.ejercicio1.entities;

public class casa extends Vivienda{
    private String disenio;
    private Double valor;

    public casa(String nombrePropietario,int edad,String disenio,Double valor){
        super(nombrePropietario,edad);
        this.disenio = disenio;
        this.valor = valor;
    }

@Override
    public void detalles(){
    System.out.println("Casa:"+
            "\nDatos sobre el propietario"+
            "\nNombre: "+nombrePropietario+
            "\nEdad: "+edad+
            "\nDiseño: "+disenio+
            "\nValor: "+valor);
    }
}
