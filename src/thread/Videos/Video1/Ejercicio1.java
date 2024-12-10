package thread.Videos.Video1;

public class Ejercicio1 {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("Mainnn");
        //System.out.println(Thread.currentThread().getName());

        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());

        /*
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }
        Thread.sleep(1000);
        System.out.println("You are done!");
         */
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        thread2.start();
        //System.out.println(thread2.isAlive());
        //thread2.setName("2nd thread");
        //System.out.println(thread2.getName());

        //thread2.setPriority(1);
        //System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());
    }
}
