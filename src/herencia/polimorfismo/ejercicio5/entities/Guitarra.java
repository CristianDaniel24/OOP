package herencia.polimorfismo.ejercicio5.entities;

public class Guitarra extends InstrumentosMusicales{
    private String modelo;
    private int garantia;
    private String estampado;
    public Guitarra(String color,String marca,Double coste,String modelo,int garantia,String estampado){
        super(color,marca,coste);
        this.modelo = modelo;
        this.garantia = garantia;
        this.estampado = estampado;
    }
    @Override
    public Double calcularDescuento(){
        Double descuento = this.coste * 0.15;
        Double descuentoFinal = this.coste - descuento;
        return descuentoFinal;
    }
    @Override
    public String detallesInstrumentos(){
        return "Detalles del dueño:"+
                "\nNombre: Carlos"+
                "\nEdad: 28"+
                "\nCiudad: Bogota";
    }
    //Sobrecarga
    public String add(String color,String marca,Double coste,String modelo,int garantia,String estampado){
        return "Guitarra 1"+
                "\nColor: "+color+"\nMarca: "+marca+
                "\nCoste: "+coste+"\nDescuento del 15%: "+calcularDescuento()+"\nModelo: "+modelo+"\nGarantia: "+garantia+"\nEstampado: "+estampado;
    }
    //Sobrecarga
    public String add(String color,String marca,Double coste,String modelo,int garantia){
        return "Guitarra 2"+
                "\nColor: "+color+"\nMarca: "+marca+
                "\nCoste: "+coste+"\nDescuento del 15%: "+calcularDescuento()+"\nModelo: "+modelo+"\nGarantia: "+garantia;
    }
}
