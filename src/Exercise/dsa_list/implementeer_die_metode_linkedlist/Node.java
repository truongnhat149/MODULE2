package Exercise.dsa_list.implementeer_die_metode_linkedlist;

public class Node {
    private Node next;
    private Object data;

    public Node(Object data) {

    }
    public Object getData() {
        return this.data;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + getData() +
                '}';
    }
}
