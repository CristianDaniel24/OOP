package LocalDateTime.LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormater = fechaActual.format(formato);
        System.out.println("La fecha actual es: " + fechaFormater);
    }
}
