package exercise_james.dsa_stack_queue.implements_stack_using_array;

public class StackClient {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(15);
        stack.push(45);
        stack.push(23);
        stack.push(7);

        System.out.println("1. Size of stack after push operation " + stack.size());
        System.out.println("pop elements from stack ");

        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("3. size of stack after pop operations " +stack.size());
    }
}
