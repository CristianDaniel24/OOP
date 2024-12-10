package LocalDateTime.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio2 {
    public static void main(String[] args) {

        LocalDateTime fechaHora = LocalDateTime.of(2024, 9, 1, 9, 30);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        String fechaHoraFormateada = fechaHora.format(formato);
        System.out.println("Fecha y la hora formateada es: " + fechaHoraFormateada);
    }
}
