package exercise_james.dsa_stack_queue.slide11.implement_queue;

public class Main {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();

        queue.enqueue("America");
        queue.enqueue("Vn");
        queue.enqueue("Japan");

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
