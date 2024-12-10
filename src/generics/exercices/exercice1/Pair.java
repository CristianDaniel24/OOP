package generics.exercices.exercice1;

public class Pair<T, U> {
    private T valueA;
    private U valueB;

    public Pair(T worthOne, U worthTwo) {
        this.valueA = worthOne;
        this.valueB = worthTwo;
    }

    public T getValueA() {
        return valueA;
    }

    public void setValueA(T valueA) {
        this.valueA = valueA;
    }

    public U getValueB() {
        return valueB;
    }

    public void setValueB(U valueB) {
        this.valueB = valueB;
    }

    @Override
    public String toString() {
        return "\nPair: " +
                "\nValueA: " + valueA +
                "\nValueB: " + valueB;
    }
}
