package exercise_james.thread.exercise_create_thread_runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running ...");
        RunnableDemo runnableDemo = new RunnableDemo("Thread 1 ");
        runnableDemo.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread 2");
        runnableDemo2.start();

        System.out.println("Main thread stopped");
    }
}
