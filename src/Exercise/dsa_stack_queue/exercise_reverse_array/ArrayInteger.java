package Exercise.dsa_stack_queue.exercise_reverse_array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayInteger {
    public static void main(String[] args) {
        // Khởi tạo stack rỗng
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number element : ");

        // khởi tạo mảng array = phần tử nhập vào từ bàn phím
        int size = sc.nextInt();
        int[] arrs = new int[size];

        // với n phần tử của mảng, lần lượt đưa vào stack thông qua push
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = (int) Math.floor(Math.random() * 100 + 1); // ở đây lấy ngẫu nhiên các số từ 1 đến 100.
            stack.push(arrs[i]);
        }
        System.out.println("Array input: ");
        System.out.print(Arrays.toString(arrs));
        // lần lượt lấy ra từ stack n phần tử và đưa vào trở lại mảng ban đầu

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = stack.pop();
        }
        System.out.println("Array after fetching from stack ");
        System.out.println(Arrays.toString(arrs));


        //=================================

        // tạo 1 wstack rỗng
        LinkedList<Character> wstack = new LinkedList<>();

        // với mỗi mword đọc từ bàn phím, đưa nó vào stack. (push)
        System.out.println("input string ");
        Scanner input = new Scanner(System.in);
        String stringg = input.nextLine();

        for (int i = 0; i < stringg.length(); i++) {
            wstack.push(stringg.charAt(i));
        }
        System.out.println("keyboard input string");
        System.out.println(wstack);
        // đọc stack cho đến hết => pop 1 word từ wstack vào mword
        //                       => nối mword vào cuối chuỗi mới vào output
        String stackPop = "";
        for (int i = 0; i < stringg.length(); i++) {
            stackPop += wstack.pop();
        }
        System.out.println("append to new string");
        System.out.println(stackPop);
    }
}
