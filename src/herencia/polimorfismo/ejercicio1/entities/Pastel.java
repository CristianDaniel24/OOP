package herencia.polimorfismo.ejercicio1.entities;

public class Pastel {
    protected String harina;
    protected Double leche ;
    protected int huevos;

    public Pastel(String harina, Double leche, int huevos){
        this.harina = harina;
        this.leche = leche;
        this.huevos = huevos;
    }
    //GETTERS
    public String getHarina(){
        return harina;
    }
    public Double getLeche(){
        return leche;
    }
    public int getHuevos(){
        return huevos;
    }
    public String detallesPastel(){
        return "La preparacion base para un pastel es:"+
                "\nLa harina necesaria es: " +this.harina+
                "\nLa leche necesaria es: "+this.leche+
                "\nLos huevos necesarios son: "+this.huevos;
    }
}
