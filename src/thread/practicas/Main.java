package thread.practicas;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread myThread2 = new Thread(new MyThread2());

        myThread1.start();
        myThread2.start();
        System.out.println("MAIN");
    }
}
