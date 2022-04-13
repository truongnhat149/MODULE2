package exercise_james.file_io.slides_james;

import java.io.IOException;

public class KhaiNiemStream {
    public static void main(String[] args) throws IOException {
//        System.out.println("simple message");
//        System.err.println("error message");
        int i = System.in.read(); // trả về mã ascii của ký tự đầu tiên
        System.out.println((char)i);
    }
}
