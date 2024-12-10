package herencia.abstraccion.ejercicio3.entities;

public class Book extends Item implements Borrowable{
    private String author;
    private int paginas;
    private String genero;

    public Book(String titulo,String id,String author,int paginas,String genero){
        super(titulo,id);
        this.author = author;
        this.paginas = paginas;
        this.genero = genero;
    }
    @Override
    public void borrowItem(){
        System.out.println("Libro prestado es: "+this.titulo);
    }
    @Override
    public void returnItem(){
        System.out.println("El item que se retorna es: "+this.titulo);
    }

    public void displayDetails(){
        System.out.println("Los Detalles son:");
    }

    public int getBorrowingPeriod(){
        return 5;
    }
}
