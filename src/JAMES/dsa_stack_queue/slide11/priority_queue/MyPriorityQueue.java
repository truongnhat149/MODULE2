package exercise_james.dsa_stack_queue.slide11.priority_queue;

public class MyPriorityQueue<E extends Comparable <E>>{
    private Heap<E> heap;

    public MyPriorityQueue() {
        heap = new Heap<>();
    }

    public void enqueue(E e) {
        heap.add();
    }
}
