package from_java_youtube_file.delete_folder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileEx {
    public static void main(String[] args) {
        File file1 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B");
        File file3 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\File1_move_files.txt");

        try {
            Files.copy(file3.toPath(), file1.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        File file1 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\File1.txt");
//        File file2 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\File1_move.txt");
//        File file3 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\File1_move_files.txt");

//        File file4 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\C");
        // Di chuyển file
//        File file_move =  new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\File1_move_files.txt");

//        try {
//            Files.move(file_move.toPath(), file4.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // tạo file
//        try {
//            file1.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // đổi tên file
//        file1.renameTo(file2);

        // đổi tên = files
//        try {
//            Files.move(file2.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
