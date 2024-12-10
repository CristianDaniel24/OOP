package Publico;

public class Clase2 {
    public static void main(String[] args){
        //Este funciona con o sin publico porque esta en el mismo paquete
        Clase1 objeto1 = new Clase1();
        objeto1.atributo = 20;
        System.out.println(objeto1.atributo);
    }
}
