package Default;

public class Clase2 {
    public static void main(String[] args){
        //Este solo se puede acceder desde las clases de el mismo paquete
    Clase1 objeto1 = new Clase1();
    objeto1.atributo = 15;
        System.out.println(objeto1.atributo);
    }
}
