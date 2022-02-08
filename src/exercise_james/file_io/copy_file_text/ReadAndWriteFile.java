package exercise_james.file_io.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile<E> {
    public List<E> readFile(String filePath) {
        List<E> strings = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));

            Object line = "";

            while ((line = br.readLine()) != null) {
                strings.add((E)line);
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("Tệp nguồn không tồn tại - tập tin đích đã tồn tại");
        }
        return strings;
    }

    public void writerFile(String filePath, E elements) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(elements.toString() + "\n");
            bufferedWriter.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
