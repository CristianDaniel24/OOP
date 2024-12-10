package herencia.polimorfismo.ejercicio5.entities;

public class Piano extends InstrumentosMusicales{
    private String modelo;
    private int garantia;
    private String estampado;
    public Piano(String color,String marca,Double coste,String modelo,int garantia,String estampado){
        super(color,marca,coste);
        this.modelo = modelo;
        this.garantia = garantia;
        this.estampado = estampado;
    }
    @Override
    public Double calcularDescuento(){
        Double descuento = this.coste * 0.20;
        Double descuentoFinal = this.coste - descuento;
        return descuentoFinal;
    }
    @Override
    public String detallesInstrumentos(){
        return "Detalles del dueño:"+
                "\nNombre: Joaquin"+
                "\nEdad: 24"+
                "\nCiudad: Sogamoso";
    }
    //Sobrecarga
    public String add(String color,String marca,Double coste,String modelo,int garantia,String estampado){
        return "Piano 1"+
                "\nColor: "+color+"\nMarca: "+marca+
                "\nCoste: "+this.coste+"\nDescuento del 20%: "+calcularDescuento()+"\nModelo: "+modelo+"\nGarantia: "+garantia+"\nEstampado: "+estampado;
    }
    //Sobrecarga
    public String add(String color,String marca,Double coste,String modelo,int garantia){
        return "Piano 2"+
                "\nColor: "+color+"\nMarca: "+marca+
                "\nCoste: "+coste+"\nDescuento del 20%: "+calcularDescuento()+"\nModelo: "+modelo+"\nGarantia: "+garantia;
    }
}
