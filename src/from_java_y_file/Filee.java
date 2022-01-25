package from_java_y_file;

import java.io.File;
import java.io.IOException;

public class Filee {
    public static void main(String[] args) throws IOException {

        // dùng \\ để ngăn cách file vd: c:\\thumuc\\ae
        // check xem folder có tồn tại = exists
        File folder = new File("D:\\JAVA\\2code\\src\\java67_file\\create_file");
        System.out.println("check that folder exists " + folder.exists());

        File folder2 = new File("D:\\JAVA\\2code\\src\\java67_file\\create_file2");
        System.out.println("check that folder exists :" + folder2.exists());

        // tạo folder
        File file1 = new File("D:\\JAVA\\2code\\src\\java67_file\\hi");
        file1.mkdir();
        System.out.println("Đã tạo, " + file1.exists());

        // tạo nhiều thư mục cùng 1 lúc
        File file2 = new File("D:\\JAVA\\2code\\src\\java67_file\\A\\B\\C\\D");
        file2.mkdirs();
        System.out.println("Đạo tạo chưa? : " + file2.exists());

        File fileB = new File("D:\\JAVA\\2code\\src\\java67_file\\A\\B");
        System.out.println("Đã tạo folder B chưa? " + file2.exists());

        // tạo tập tin
        File createFile = new File("D:\\JAVA\\2code\\src\\java67_file\\A\\Vidu2.txt");
        createFile.createNewFile();
        System.out.println("Đã tạo chưa?" + createFile.exists());
    }
}
