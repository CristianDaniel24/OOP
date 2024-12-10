package thread.Videos.Video2;

public class Ejercicio2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);
        
        thread1.start();
        thread1.join(3000);
        thread2.start();
        System.out.println(1 / 0);
    }
}