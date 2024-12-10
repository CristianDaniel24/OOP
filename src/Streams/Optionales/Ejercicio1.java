package Streams.Optionales;

import java.util.Optional;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Se crea un opcional con un valor
        Optional<String> optionalValor = Optional.of("Hello World");

        //Crear Optional que podria ser null
        Optional<String> optionalNull = Optional.ofNullable(null);

        //Validar si el Optional tiene algun valor
        if (optionalValor.isPresent()) {
            System.out.println("\nPresent value: " + optionalValor.get());
        } else {
            System.out.println("\nNot exits value ");
        }

        //Obtener un valor con orElse
        /*
        orElse(): Este metodo devuelve el valor contenido en el Optional si esta presente.
        Si el Optional esta vacio, devuelve el valor proporcionado por defecto es este caso: Value for default
         */
        String defaultValue = optionalNull.orElse("Value for default");
        System.out.println("\nValue: " + defaultValue);

        //Usar ifPresent para ejecutar una accion si se encuentra un valor
        optionalValor.ifPresent(value -> System.out.println("\nThe values is: " + value));

        //Usar ifPresentOrElse para manejar ambos casos
        optionalNull.ifPresentOrElse(
                value -> System.out.println("\nThe value is: " + value),
                () -> System.out.println("\nThe optional is empty")
        );
    }
}
