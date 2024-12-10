package parte1;

public class Bajo {
    // Atributos
    private String color;
    private String marca;
    private String modelo;
    private int year;

    //Constructor
    public Bajo(String color, String marca, String modelo, int year){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }
    public void imprimir(){
        System.out.println("Los atributos insertados son:");
        System.out.println(color);
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
    }
    // Métodos
    void sonar() {
        System.out.println("El Bajo esta sonando...");
    }
}