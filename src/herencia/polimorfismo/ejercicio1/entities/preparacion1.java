package herencia.polimorfismo.ejercicio1.entities;

public class preparacion1 extends Pastel{
    private String fruta;

    public preparacion1(String harina, Double leche, int huevo, String fruta){
        super(harina,leche,huevo);
        this.fruta = fruta;
    }
    public String getFruta(){
        return fruta;
    }
    @Override
    public String detallesPastel(){
        return "Para esta preparacion se necesita:"+
                "\nHarina: " +this.harina+
                "\nleche: "+this.leche+
                "\nHuevos: "+this.huevos+
                "\nFrutas: "+this.fruta;
    }
}
