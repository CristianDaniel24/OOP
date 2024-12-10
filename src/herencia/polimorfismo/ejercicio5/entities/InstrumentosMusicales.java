package herencia.polimorfismo.ejercicio5.entities;

public class InstrumentosMusicales {
    protected String color;
    protected String marca;
    protected Double coste;

    public InstrumentosMusicales(String color,String marca,Double coste){
        this.color = color;
        this.marca = marca;
        this.coste = coste;
    }
    public Double calcularDescuento(){
            Double porcentaje = this.coste * 0.5;
            return porcentaje;
        }
    public String detallesInstrumentos() {
    return "Los instrumentos musicales tienen:"+
            "\nColor"+
            "\nMarca"+
            "\nCoste";
    }
}