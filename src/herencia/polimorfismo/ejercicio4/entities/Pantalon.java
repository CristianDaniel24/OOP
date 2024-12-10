package herencia.polimorfismo.ejercicio4.entities;

public class Pantalon extends PrendasDeVestir{
    private String modelo;
    private String estampado;
    private Double coste;

    public Pantalon(String color,String material,String marca,String modelo,String estampado,Double coste){
        super(color,material,marca);
        this.modelo = modelo;
        this.estampado = estampado;
        this.coste = coste;
    }
    //Sobrecarga
    public String add(String color,String material,String marca,String modelo,String estampado,Double coste){
        return "Pantalon 1"+
                "\nColor: "+color+"\nMaterial: "+material+"\nMarca: "+marca+
                "\nModelo: "+modelo+"\nEstampado: "+estampado+"\nCoste: "+coste;
    }
    //Sobrecarga
    public String add(String color,String material,String marca,String modelo,Double coste){
        return "Pantalon 2"+
                "\nColor: "+color+"\nMaterial: "+material+"\nMarca: "+marca+
                "\nModelo: "+modelo+"\nCoste: "+coste;
    }
}
