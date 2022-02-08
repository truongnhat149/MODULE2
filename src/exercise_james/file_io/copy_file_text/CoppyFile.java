package exercise_james.file_io.copy_file_text;

import java.util.List;

public class CoppyFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("D:\\JAVA\\2code\\src\\exercise_james\\file_io\\copy_file_text\\source_file.txt");
        for (String e : list) {
            readAndWriteFile.writerFile("D:\\JAVA\\2code\\src\\exercise_james\\file_io\\copy_file_text\\target_file.txt", e);
        }
    }
}
