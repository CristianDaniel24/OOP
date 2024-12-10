package DateTime;

import java.util.Calendar;

public class Ejemplo {
    public static void main(String[] args) {
        // Obtener la fecha y hora actual
        Calendar ahora = Calendar.getInstance();

        // Usar printf para formatear y mostrar la fecha y hora
        System.out.printf("%02d/%02d/%04d, %02d:%02d:%02d\n",
                ahora.get(Calendar.MONTH) + 1,  // Mes (agregar 1 porque enero es 0)
                ahora.get(Calendar.DAY_OF_MONTH),  // Dia del mes
                ahora.get(Calendar.YEAR),  // Año
                ahora.get(Calendar.HOUR_OF_DAY),  // Hora (24 horas)
                ahora.get(Calendar.MINUTE),  // Minutos
                ahora.get(Calendar.SECOND));  // Segundos
    }
}
