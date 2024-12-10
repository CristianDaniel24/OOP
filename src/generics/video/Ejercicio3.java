package generics.video;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hola");
        printList(stringList);
    }

    //Cuando se desconoce de que tipos van a estar en la lista entonces se pone un signo de interrogacion que es un comodin
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }

    //Tambien se puede poner mas especifico diciendo que hereda de la clase Animal
    /*
    private static void printList(List<? extends Animal> myList) {
        System.out.println(myList);
    }
     */
}
