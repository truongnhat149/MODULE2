package java_exercise_youtube.Java64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> listStudent = new LinkedList<>();

        listStudent.offer("Nhat Truong");
        listStudent.offer("Le phung");
        listStudent.offer("C1121");
        System.out.println("trước khi xóa " +listStudent);
        while (true) {
            String ten = listStudent.poll(); // lấy ra và xóa
            if (ten == null) break;

            // peek lấy ra k xóa
            System.out.println(ten);
        }
    }
}
