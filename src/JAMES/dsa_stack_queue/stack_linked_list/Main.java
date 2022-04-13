package exercise_james.dsa_stack_queue.stack_linked_list;

public class Main {
    public static void main(String[] args) {

        GenericStackClient genericStackClient = new GenericStackClient();

        System.out.println("Stack of integers :");
        genericStackClient.stackOfInteger();


        System.out.println("Stack of strings ");
        genericStackClient.stackOfIStrings();
    }
}
