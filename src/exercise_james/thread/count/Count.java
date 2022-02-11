package exercise_james.thread.count;

import exercise_james.abstract_and_interface.example_1.Runable;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interupped");
        }
        System.out.println("my thread run is over");
    }
}
