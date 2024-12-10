package herencia.polimorfismo.ejercicio2.entities;

public class Computador2 extends Computador{
    private String color;

    public Computador2(String marca,int fecha, String color, Double coste){
        super(marca,fecha,coste);
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public Double calcularValor(){
        Double porcentaje = this.getCoste() + this.getCoste() * 0.2;
        return porcentaje;
    }
    @Override
    public String detallesComputador(){
        return "Detalles del computador Vivobook-pro son:"+
                "\nMarca: "+this.marca+
                "\nAño: "+this.fecha+
                "\nColor: "+this.color+
                "\nCoste total: "+calcularValor();
    }
}
