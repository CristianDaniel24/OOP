package generics.exercices.exercice3;

public class NumberBox<T extends Number> {
    private final T number1;
    private final T number2;

    public NumberBox(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Double add() {
        return number1.doubleValue() + number2.doubleValue();
    }

    public Double substract() {
        return number1.doubleValue() - number2.doubleValue();
    }
}
