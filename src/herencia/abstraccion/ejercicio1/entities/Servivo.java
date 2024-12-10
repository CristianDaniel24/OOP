package herencia.abstraccion.ejercicio1.entities;

public abstract class Servivo {
protected String nombre;

    public abstract void comer();//Aqui solo se define como abstracto sin usar los corchetes

    public abstract void dormir();

    public void respirar(){
        System.out.println("Los seres vivos respiran");
    }
}