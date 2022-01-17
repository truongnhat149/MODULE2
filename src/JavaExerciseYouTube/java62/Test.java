package JavaExerciseYouTube.java62;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stringStack = new Stack<String>();

        // stringStack.push đưa giá trị vào chuỗi
        // stringStack.pop lấy giá trị ra, xóa khỏi stack
        // stringStack.peek => lấy ra giá trị nhưng không xóa khỏi danh sách
        // stringStack.clear => xóa all element
        // stringStack.contains("<giá trị>") => xác định giá trị có tồn tại trog stack không>

        // ví dụ đảo ngược chuỗi
        System.out.println("Nhập vào chuỗi");
        String stringg = sc.nextLine();
        // VD: nhập vào"LPNT"
        for (int i = 0; i < stringg.length(); i++) {
            stringStack.push(stringg.charAt(i)+ "");
        }
        System.out.println("Đảo ngược chuỗi");
        for(int i = 0; i < stringg.length(); i++) {
            System.out.print(stringStack.pop());
        }
        System.out.println();
        // VD chuyển từ hệ thập phân sang hệ nhị phân

        Stack<Integer> stackSoDu = new Stack<>();
        System.out.println("Nhập 1 số từ bàn phím");
        int x = sc.nextInt();
        while (x > 0) {
            int soDu = x % 2;
            stackSoDu.push(soDu);
            x = x/2;
        }
        int size = stackSoDu.size();
        for (int i =0; i < size; i++) {
            System.out.print(stackSoDu.pop());
        }

    }
}
