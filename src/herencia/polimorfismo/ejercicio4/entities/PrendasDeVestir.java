package herencia.polimorfismo.ejercicio4.entities;

public class PrendasDeVestir {
    protected String color;
    protected String material;
    protected String marca;

    public PrendasDeVestir(String color,String material,String marca){
        this.color = color;
        this.material = material;
        this.marca = marca;
    }
    public String add(){
        return "Prenda 1"+
                "\nColor: "+this.color+
                "\nMaterial: "+this.material+
                "\nMarca: "+this.marca+"\n";
    }
    public String detallesPrendas(){
        return "Las caracteristicas basicas de una prenda son:"+
                "\nColor"+
                "\nMaterial"+
                "\nMarca";
    }
}