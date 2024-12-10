package ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo3 {
    public static void main(String[] args) {
        String telefono1 = "123-456-7890"; // Válido
        String telefono2 = "1234567890";   // No válido
        String telefono3 = "123-4567-890"; // No válido

        // Expresion regular simple para validar un numero de telefono
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";

        // Compilar la expresion regular
        Pattern pattern = Pattern.compile(regex);

        // Validar los numeros de telefono
        validarTelefono(telefono1, pattern);
        validarTelefono(telefono2, pattern);
        validarTelefono(telefono3, pattern);
    }

    public static void validarTelefono(String telefono, Pattern pattern) {
        Matcher matcher = pattern.matcher(telefono);
        if (matcher.matches()) {
            System.out.println(telefono + " SI es valido");
        } else {
            System.out.println(telefono + " NO es valido");
        }
    }
}
