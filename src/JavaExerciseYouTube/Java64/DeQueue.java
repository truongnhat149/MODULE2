package JavaExerciseYouTube.Java64;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {
    public static void main(String[] args) {
        Deque<String> listStudent = new ArrayDeque<String>();

        listStudent.offer("Le");
        listStudent.offer("phung");
        listStudent.offer("Nhat");
        listStudent.offer("Truong");
        listStudent.offerFirst("C11");
        listStudent.offerFirst("21i1"); // => thêm phần tử vào đầu danh sách
        while (true)
        {
            String ten = listStudent.poll(); // => lấy ra và xóa
            if (ten == null) break;
            System.out.println("lay phan tu " +ten);

        }
    }
}
