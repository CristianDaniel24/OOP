package herencia.polimorfismo.ejercicio5.entities;

public class Bateria extends InstrumentosMusicales{
    private String modelo;
    private int garantia;
    private String estampado;
    public Bateria(String color,String marca,Double coste,String modelo,int garantia,String estampado){
        super(color,marca,coste);
        this.modelo = modelo;
        this.garantia = garantia;
        this.estampado = estampado;
    }
    @Override
    public Double calcularDescuento(){
        Double descuento = this.coste * 0.10;
        Double descuentoFinal = this.coste - descuento;
        return descuentoFinal;
    }
    @Override
    public String detallesInstrumentos(){
        return "Detalles del dueño:"+
                "\nNombre: Juan"+
                "\nEdad: 25"+
                "\nCiudad: Tunja";
    }
    //Sobrecarga
    public String add(String color,String marca,Double coste,String modelo,int garantia,String estampado){
        return "Bateria 1"+
                "\nColor: "+color+"\nMarca: "+marca+
                "\nCoste: "+coste+"\nDescuento del 10%: "+calcularDescuento()+"\nModelo: "+modelo+"\nGarantia: "+garantia+"\nEstampado: "+estampado;
    }
    //Sobrecarga
    public String add(String color,String marca,Double coste,String modelo,int garantia){
        return "Bateria 2"+
                "\nColor: "+color+"\nMarca: "+marca+
                "\nCoste: "+coste+"\nDescuento del 10%: "+calcularDescuento()+"\nModelo: "+modelo+"\nGarantia: "+garantia;
    }
}
