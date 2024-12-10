package thread.daemon;

public class DaemonEjercicio2 implements Runnable {

    @Override
    public void run() {
        //Este while es infinito porque esta definido en True
        //Al establecerlo como daemon se asegura de que el programa se cierre correctamente cuando el hilo principal termine
        while (true) {
            try {
                System.out.println("Hilo deamon: realizando tareas en segundo plano...");
                Thread.sleep(1000);//Pausar el hilo por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
