package herencia.polimorfismo.ejercicio2.entities;

public class Computador {
    protected String marca;
    protected int fecha;
    protected Double coste;

    public Computador(String marca, int fecha, Double coste){
        this.marca = marca;
        this.fecha = fecha;
        this.coste = coste;
    }
    public String getMarca(){
        return marca;
    }
    public Double getCoste(){
        return coste;
    }
    public Double calcularValor(){
        Double porcentaje = this.coste * 0.5;
        return porcentaje;
    }
    public String detallesComputador(){
        return "Los detalles del computador base son:"+
                "\nMarca: "+this.marca+
                "\nAño: "+this.fecha+
                "\nCoste general: "+this.coste;
    }
}
