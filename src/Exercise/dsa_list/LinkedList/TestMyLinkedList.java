package Exercise.dsa_list.LinkedList;

public class TestMyLinkedList {
    // tạo lớp TestLinkedList chứa hàm main, tạo đối tượng Mylinked list ,
    // gọi addFirst(), add(), print() chạy ứng dụng
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");

        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4, 9);
        myLinkedList.add(4, 9);
        myLinkedList.printList();
    }
}
