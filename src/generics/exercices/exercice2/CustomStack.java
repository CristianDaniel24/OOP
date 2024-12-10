package generics.exercices.exercice2;

import java.util.ArrayList;

public class CustomStack<T> {
    private final ArrayList<T> stack = new ArrayList<>();

    public CustomStack() {
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        T itemDeleted = stack.getLast();
        stack.remove(stack.getLast());
        return itemDeleted;
    }

    public T peek() {
        return stack.getLast();
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }
}
