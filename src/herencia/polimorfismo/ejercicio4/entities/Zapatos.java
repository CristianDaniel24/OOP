package herencia.polimorfismo.ejercicio4.entities;

public class Zapatos extends PrendasDeVestir{
    private String estampado;
    private String tipo;
    private Double coste;

    public Zapatos(String color,String material,String marca,String estampado,String tipo,Double coste){
        super(color,material,marca);
        this.estampado = estampado;
        this.tipo = tipo;
        this.coste = coste;
    }
    //Sobrecarga
    public String add(String color,String material,String marca,String tipo,Double coste){
        return "Zapatos 1"+
                "\nColor: "+color+"\nMaterial: "+material+"\nMarca: "+marca+
                "\nTipo: "+tipo+"\nCoste: "+coste;
    }
    //Sobrecarga
    public String add(String color,String material,String marca,String estampado,String tipo,Double coste){
        return "Zapatos 2"+
                "\nColor: "+color+"\nMaterial: "+material+"\nMarca: "+marca+
                "\nEstampado: "+estampado+"\nTipo: "+tipo+"\nCoste: "+coste;
    }
}
