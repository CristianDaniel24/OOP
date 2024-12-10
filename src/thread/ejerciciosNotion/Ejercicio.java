package thread.ejerciciosNotion;

public class Ejercicio {
    public static void main(String[] args) {
        SimpleThread simpleThread1 = new SimpleThread("Thread1");
        SimpleThread simpleThread2 = new SimpleThread("Thread2");
        SimpleThread simpleThread3 = new SimpleThread("Thread3");

        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();
    }
}
