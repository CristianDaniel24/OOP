package generics.video;

public class Ejercicio2 {
    public static void main(String[] args) {
        shout("Jhon", 27);
        //shout(27);
        //shout(25.3);
        //shout(true);
        // shout(new Cat());
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!");
    }


    /*
    //El mismo metodo pero con un retorno de tipo T
    private static <T, V> T shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!");
        return thingToShout;
    }
 */
}
