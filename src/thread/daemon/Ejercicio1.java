package thread.daemon;

public class Ejercicio1 {
    public static void main(String[] args) {

        DaemonThread daemonThread = new DaemonThread();

        //Se establece un hilo como daemon
        daemonThread.setDaemon(true);

        daemonThread.start();

        // Hilo principal realiza otra tarea y luego finaliza
        System.out.println("\nHilo principal realizando una tarea");
        try {
            Thread.sleep(3000);//Hilo principal espera 3 segundos antes de terminar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hilo principal terminado");
    }
}
