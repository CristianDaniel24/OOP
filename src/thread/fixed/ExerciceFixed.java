package thread.fixed;

public class ExerciceFixed implements Runnable {

    public ExerciceFixed() {
    }

    @Override
    public void run() {
        System.out.println("Hello..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
