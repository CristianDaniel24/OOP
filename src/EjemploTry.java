import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploTry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Ingrese el numero");
                System.out.println("2. Exit");
                System.out.println("Ingrese una opcion:");
                int opcion = Integer.parseInt(reader.readLine());
                if (opcion == 1) {
                    System.out.println("Ingrese un numero:");
                    Double numero = Double.parseDouble(reader.readLine());
                    System.out.println("Numero del usuario: " + numero);
                } else if (opcion == 2) {
                    System.out.println("Exit..");
                    reader.close();
                    exit = true;
                } else {
                    System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Porfavor ingrese un numero");
            }
        }
    }
}
