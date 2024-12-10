package thread.practicas;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (count < 5) {
            System.out.println("INFO - MyThread2 count: " + count++);
            try {
                Thread.sleep(1800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
