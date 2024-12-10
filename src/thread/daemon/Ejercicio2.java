package thread.daemon;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Se crea el Thread daemon
        Thread daemonThread = new Thread(new DaemonEjercicio2());

        //Se establece el Thread como daemon
        daemonThread.setDaemon(true);
        daemonThread.start();

        //El Thread principal simula la tarea que tarda 3 segundos
        System.out.println("Thread principal ejecutando la tarea principal..");
        try {
            //Se crean muchos objetos para simular la actividad del Garbage Collector
            for (int i = 0; i < 1000000; i++) {
                //Esto se usa para crear muchas instancias de String de manera rapida,
                //y asi simular el uso de memoria y asi forzar la actividad del Garbage Collector
                String text = "Cadena de texto " + i;
            }
            Thread.sleep(3000);//Se duerme por 3 segundos mientras que el daemon esta ejecutandose en segundo plano
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tarea principal terminada..");
        // En este punto, si el hilo principal termina, el hilo daemon tambien terminara automaticamente
    }
}
