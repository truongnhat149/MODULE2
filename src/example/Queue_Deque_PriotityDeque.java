package example;

import java.util.*;

public class Queue_Deque_PriotityDeque {
    public static void main(String[] args) {
        Queue<String> deque = new PriorityQueue<>();
        deque.offer("le phung A");
        deque.offer("le phung");
        deque.offer("nhat truong C");
        deque.offer("nhat truong B");
        deque.offer("c1121i1");
        deque.offer("c1121i0");

        while (true) {
            String ten = deque.poll(); // => lấy vào xóa
            if (ten == null)
                break;

            System.out.println(ten);
        }
    }
}
