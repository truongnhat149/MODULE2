package from_java67_file.write_data_folder;

import java.io.PrintWriter;

public class TextExample {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\File1_move_files.txt"
            , "UTF-8");
            pw.println("Xin chào!");
            pw.print('A');
            pw.println(3.14);
            pw.println("Nhật Trường");
            pw.println();
            Student student = new Student("Trường", 24);
            pw.println(student);
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
