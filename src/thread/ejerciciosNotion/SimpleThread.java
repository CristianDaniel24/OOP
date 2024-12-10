package thread.ejerciciosNotion;

public class SimpleThread extends Thread {
    private String thread;

    public SimpleThread(String thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(thread + " Iteration: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(thread + " Interrupted =(");
            }
        }
        System.out.println("Finish");
    }
}
