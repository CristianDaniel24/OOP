package Publico.accesoPublico;

import Publico.Clase1;

public class Clase3 {
    public static void main(String[] args){
        //Este se puede acceder si el modificador de acceso es publico
        Clase1 objeto1 = new Clase1();
        objeto1.atributo = 20;
        System.out.println(objeto1.atributo);
    }
}
