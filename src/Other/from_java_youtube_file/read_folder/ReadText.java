package from_java_youtube_file.read_folder;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadText {
    public static void main(String[] args) {
//        File f = new File("D:\\JAVA\\2code\\src\\from_java67_file\\read_folder\\file_read.txt");
//
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while (true) {
//                line = br.readLine();
//                if (line == null) {
//                    break;
//                } else {
//                    System.out.println(line);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Cách 2

        File f2 = new File("D:\\\\JAVA\\\\2code\\\\src\\\\from_java67_file\\\\read_folder\\\\file_read.txt");

        try {
            List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
