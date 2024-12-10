package generics;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Crear un Par con Integer y String
        Par<Integer, String> par = new Par<>(1, "Uno");
        System.out.println("Primero: " + par.getPrimero()); //1
        System.out.println("Segundo: " + par.getSegundo()); //Uno

        // Crear un Par con Double y Boolean
        Par<Double, Boolean> newPar = new Par<>(2.14, true);
        System.out.println("\nPrimero: " + newPar.getPrimero()); //2.14
        System.out.println("Segundo: " + newPar.getSegundo()); //true
    }

    public static class Par<T, U> {
        private T primero;
        private U segundo;

        public Par(T primero, U segundo) {
            this.primero = primero;
            this.segundo = segundo;
        }

        public T getPrimero() {
            return primero;
        }

        public U getSegundo() {
            return segundo;
        }
    }
}
