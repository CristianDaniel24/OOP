package generics.methods.Exercise3;

public class Exercise3 {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = createPair(12, "Hello");
        Pair<Double, Character> pair2 = createPair(5.2, 'H');
        Pair<Boolean, String> pair3 = createPair(true, "Hello");

        System.out.println("The pair 1 is: " + pair1);
        System.out.println("\nThe pair 2 is: " + pair2);
        System.out.println("\nThe pair 3 is: " + pair3);
    }

    public static <T, U> Pair<T, U> createPair(T firts, U second) {
        return new Pair<>(firts, second);
    }
}
