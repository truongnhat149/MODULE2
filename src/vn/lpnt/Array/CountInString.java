package vn.lpnt.Array;
import java.util.*;

public class CountInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // đếm 1 ký tự được nhập vào từ bàn phím cho 1 chuỗi cho trc;
        String rdString = "nhattruong";
        char fi = 't';
        int count = 0;

        int len = rdString.length();
        for (int i = 0; i < len; i++) {
            if(rdString.charAt(i) == fi) {
                count++;
            }
        }
        System.out.println("Number of occurrences in string "+ count);
    }
}
