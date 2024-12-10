package generics.exercices.exercice1;

public class Ejercicio1 {
    public static void main(String[] args) {

        Pair<Integer, String> pairIntegerString = new Pair<>(8, "Hi");

        Pair<String, String> pairStringString = new Pair<>("Hello", "Bob");

        System.out.println(pairIntegerString);
        System.out.println(pairStringString);
    }
}