package herencia.abstraccion.ejercicio3.entities;

public class DVD extends Item implements Borrowable{
    private String author;
    private int duration;
    private String genero;

    public DVD(String titulo,String id,String author,int duration,String genero){
        super(titulo,id);
        this.author = author;
        this.duration = duration;
        this.genero = genero;
    }

    @Override
    public void borrowItem(){
        System.out.println("El DVD prestado es: "+this.titulo);
    }
    @Override
    public void returnItem(){
        System.out.println("El item que se retorna es: "+this.titulo);
    }
    public void displayDetails(){
        System.out.println("Los detalles son:");
    }
    public int getBorrowingPeriod(){
        return 2;
    }
}
