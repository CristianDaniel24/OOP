package LocalDateTime.LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio2 {
    public static void main(String[] args) {

        LocalDate fechaInicio = LocalDate.of(2005, 12, 26);
        LocalDate fechaFin = LocalDate.of(2024, 9, 1);

        long diferenciaDias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        System.out.println("Dias entre " + fechaInicio + " y " + fechaFin + " son: " + diferenciaDias);
    }
}
