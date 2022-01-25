package from_java_y_file.delete_folder;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void deleteFile(File fx) {
        if (fx.isFile()) //nếu đay là file thì
        {
            System.out.print("Deleted "  + fx.getAbsolutePath());
            fx.delete(); // xóa tập tin này
        } else if (fx.isDirectory()) {
            File[] mangCon = fx.listFiles();
            for(File f : mangCon) {
                deleteFile(f);
            }
            // xóa bản thân thư mục sau khi xóa các file con
            System.out.print("Đã xóa: " + fx.getAbsolutePath());
            fx.delete();
        }
    }
    public static void main(String[] args) throws IOException {
        File file0 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\A");
        File file1 = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\C\\D");

//        file1.mkdirs(); => tạo ra file

        File filetxt = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\A\\Vidu.txt");
        File fileDoc = new File("D:\\JAVA\\2code\\src\\from_java67_file\\delete_folder\\B\\C\\D\\Vidu.doc");

//        filetxt.createNewFile(); => tạo file có đuôi txt hoặc doc
//        fileDoc.createNewFile();

//        filetxt.delete();
//        fileDoc.deleteOnExit();
        FileExercise.deleteFile(file0);
    }
}
