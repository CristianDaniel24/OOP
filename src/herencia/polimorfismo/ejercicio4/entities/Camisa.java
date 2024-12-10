package herencia.polimorfismo.ejercicio4.entities;

public class Camisa extends PrendasDeVestir{
    private String tipoEstampado;
    private String mangaLarga;
    private Double coste;

    public Camisa(String color,String material,String marca,String tipoEstampado,String mangaLarga,Double coste){
        super(color,material,marca);
        this.tipoEstampado = tipoEstampado;
        this.mangaLarga = mangaLarga;
        this.coste = coste;
    }
    //Sobrecarga
    public String add(){
        String resultado  = super.add();
        return resultado.concat("Coste: "+this.coste);
    }
    //Sobrecarga
    public String add(String color,String material,String marca,String tipoEstampado,String mangaLarga,Double coste) {
        return "Camisa 2" +
                "\nColor: " + color + "\nMaterial: " + material + "\nMarca: " + marca +
                "\nTipo de estampado: " + tipoEstampado + "\nManga larga: " + mangaLarga + "\nCoste: " + coste;
    }
}