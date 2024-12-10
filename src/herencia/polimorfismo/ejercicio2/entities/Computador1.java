package herencia.polimorfismo.ejercicio2.entities;

public class Computador1 extends Computador{
    private String color;

    public Computador1(String marca,int fecha, String color, Double coste){
        super(marca,fecha,coste);
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public Double calcularValor(){
        Double porcentaje = this.getCoste() + this.getCoste() * 0.1;
        return porcentaje;
    }
    @Override
    public String detallesComputador(){
        return "Detalles del computador Vivobook son:"+
                "\nMarca: "+this.marca+
                "\nAño: "+this.fecha+
                "\nColor: "+this.color+
                "\nCoste total: "+calcularValor();
    }
}
