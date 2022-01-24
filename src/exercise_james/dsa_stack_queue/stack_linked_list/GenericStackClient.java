package exercise_james.dsa_stack_queue.stack_linked_list;

public class GenericStackClient {
    public static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();

        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(1);
        stack.push(2);
        stack.push(4);

        System.out.println("size stack after push operations " + stack.size());
        System.out.println("pop elements from stack: " );
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("size of stack after pop operations " + stack.size());
    }
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Truong");
        stack.push("Phuong");
        stack.push("Dung");
        stack.push("Tung");
        stack.push("Tung2");
        stack.push("Tung3");

        System.out.println("size of stack after push operations " + stack.size());
        System.out.println("Pop elements from stack ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("size of stack after pop eperations : " + stack.size());
    }

}
