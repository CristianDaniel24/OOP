package thread.Videos.Video1;

public class MyThread extends Thread {

    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("This is a deamon thread is running");
        } else {
            System.out.println("This is user thread that is running");
        }
    }
}
