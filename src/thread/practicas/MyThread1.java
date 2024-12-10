package thread.practicas;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        int count = 0;
        while (count < 5) {
            System.out.println("INFO - MyThread1 count: " + count++);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
