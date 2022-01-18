package JavaExerciseYouTube.Java64;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue<String> listStudent = new java.util.PriorityQueue<String>();
        // Priority Queue
        listStudent.offer("Le Phung");
        listStudent.offer("Nhat Truong");
        listStudent.offer("C11");
        listStudent.offer("21I1");
        System.out.println("Trước khi xóa " + listStudent);
        while (true) {
            String ten = listStudent.poll(); // lấy ra và xóa poll
            if (ten == null) break;

            System.out.println(ten);
        }
    }
}
