package Protected;

public class Clase2 extends Clase1{
    public static void main(String[] args){
        //Este es protected funciona porque en la clase se uso el Extends para indicarle que Clase1 es una clase padre
        Clase1 objeto1 = new Clase1();
        objeto1.atributo1 = 30;
        System.out.println(objeto1.atributo1);
    }
}
