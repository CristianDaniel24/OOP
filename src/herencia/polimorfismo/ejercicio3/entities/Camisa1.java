package herencia.polimorfismo.ejercicio3.entities;

public class Camisa1 extends Camisa{
    private String color;
    private String diseño;
    private Double coste;

 public Camisa1(String material,String marca,String empresaTextil,String color,String diseño,Double coste){
     super(material,marca,empresaTextil);
     this.color = color;
     this.diseño = diseño;
     this.coste = coste;
 }
    public Double descuentoCamisa(Double coste){
        Double descuento = coste * 0.10;
        Double descuentoFinal = coste - descuento;
        return descuentoFinal;
    }
    @Override
    public String detallesCamisa(){
     return "Detalles de la camisa 1"+
             "\nMaterial: "+material+
             "\nMarca: "+marca+
             "\nEmpresa Textil: "+empresaTextil+
             "\nColor: "+color+
             "\nDiseño: "+diseño+
             "\nCoste: "+coste+
             "\nDescuento del 10% por su primera compra: "+ descuentoCamisa(coste);
    }















}