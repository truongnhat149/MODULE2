package Exercise.dsa_stack_queue.implements_queue_using_array;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(6);

        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(16);
        queue.enqueue(19);
        queue.dequeue();
        queue.enqueue(24);
        queue.enqueue(30);
    }
}
