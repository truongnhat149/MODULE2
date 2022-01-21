package java_exercise_youtube.stack_in_java;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Stack<String> stack = new Stack<>();
        // stringStack.push đưa giá trị vào chuỗi
        // stringStack.pop lấy giá trị ra, xóa khỏi stack
        // stringStack.peek => lấy ra giá trị nhưng không xóa khỏi danh sách
        // stringStack.clear => xóa all element
        // stringStack.contains("<giá trị>") => xác định giá trị có tồn tại trog stack không>

        // ví dụ đảo ngược chuỗi
        System.out.println("Nhập vào chuỗi");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i) + "");
        }
        // đưa các phần tử chuỗi nhập vào stack
        System.out.println("Chuỗi đảo ngược");
        for (int i = 0; i < s.length(); i++)
        {
            System.out.print(stack.pop());
        }
        System.out.println();
        // ví dụ chuyển từ số thập phân qua nhị phân
        Stack<Integer> integers = new Stack<>();
        System.out.println("Nhập vào số muốn chuyển đổi");
        int num = sc.nextInt();
        while (num > 0) {
            int soDu = num % 2;
            integers.push(soDu); // => ở đây sẽ tự động ép kiểu
            num = num / 2;
        }
        int size = integers.size();
        for (int i = 0; i < size; i++ ) {
            System.out.print(integers.pop());
        }
    }
}
