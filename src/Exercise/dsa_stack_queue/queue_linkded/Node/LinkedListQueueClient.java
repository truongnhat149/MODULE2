package Exercise.dsa_stack_queue.queue_linkded.Node;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(-1);
        queue.enqueue(20);
        queue.enqueue(8);
        queue.dequeue();

        System.out.println("Dequeed item is " + queue.dequeue().key);
    }
}
