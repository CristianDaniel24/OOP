package thread.daemon;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Hilo daemon monitoreando");
                Thread.sleep(1000); //Esperando 1 segundo antes de repetir
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
