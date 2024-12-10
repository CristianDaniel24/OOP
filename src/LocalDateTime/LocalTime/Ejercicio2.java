package LocalDateTime.LocalTime;

import java.time.LocalTime;

public class Ejercicio2 {
    public static void main(String[] args) {

        LocalTime horaInicio = LocalTime.of(10, 30);
        LocalTime horaFin = LocalTime.of(18, 15); // 6:15 PM

        if (horaInicio.isBefore(horaFin)) {
            System.out.println("La hora del inicio esta antes que la hora del fin.");
        } else {
            System.out.println("La hora de inicio esta despues o esta igual que la hora de fin.");
        }
    }
}
