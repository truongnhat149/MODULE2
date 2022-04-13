package from_java_youtube_file.zip;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultipleFiles {
    public static void main(String[] args) throws IOException {
        List<String> scrFiles = Arrays.asList("D:\\JAVA\\2code\\src\\from_java_y_file\\zip\\test.txt", "D:\\JAVA\\2code\\src\\from_java_y_file\\zip\\test2.txt");
        FileOutputStream fos = new FileOutputStream("multiCompressed.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String scrFile : scrFiles)
        {
            File fileToZip = new File(scrFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0)
            {
                zipOut.write(bytes, 0 , length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
    }
}
