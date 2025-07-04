import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Practica {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Tipos de datos:");
        // Tipos de datos
        Integer entero = 5;
        Double decimal = 2.5;
        Boolean booleano = true;
        String texto = "Esto es un texto";

        System.out.println(booleano);

        List<String> listaNumero = new ArrayList<>();

        listaNumero.add("2");
        listaNumero.add("5");

        System.out.println("\nIteracion simple usando for each");
        for (String numeroIteraciom : listaNumero) {
            System.out.println(numeroIteraciom);
        }

        boolean salir = false;
        while (!salir) {
            try {
                System.out.println("\nMenu sencillo usando excepciones");
                System.out.println("1. sumar");
                System.out.println("2. restar");
                System.out.println("3. exit");
                System.out.println("Ingrese una opcion:");
                int option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        System.out.println("Ingrese el numero 1:");
                        int sumaNum1 = Integer.parseInt(reader.readLine());
                        System.out.println("Ingrese el numero 2:");
                        int sumaNum2 = Integer.parseInt(reader.readLine());
                        int resultadoSuma = sumaNum1 + sumaNum2;
                        System.out.println("\nEl resultado de la suma es: " + resultadoSuma);
                        break;
                    case 2:
                        System.out.println("Ingrese el numero 1:");
                        int restaNum1 = Integer.parseInt(reader.readLine());
                        System.out.println("Ingrese el numero 2:");
                        int restaNum2 = Integer.parseInt(reader.readLine());
                        int resultadoResta = restaNum1 - restaNum2;
                        System.out.println("\nEl resultado de la resta es: " + resultadoResta);
                        break;
                    case 3:
                        System.out.println("Saliendo de la aplicacion..");
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion que ingresaste no existe");
                }
            } catch (NumberFormatException e) {
                System.out.println("Porfavor ingresa un numero");
            }
        }
    }
}