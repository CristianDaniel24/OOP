package linketList;

import java.util.LinkedList;

public class Ejercicio1 {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();

        friends.addFirst("Juan");
        friends.addFirst("Carlos");
        friends.addFirst("Ana");
        friends.addLast("Lucía");
        friends.addLast("Mario");

        System.out.println("List: " + friends);

        // Eliminar primer y último elemento
        friends.removeFirst();
        friends.removeLast();

        System.out.println("List after of deleted: " + friends);
    }
}
