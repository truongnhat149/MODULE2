package exercise_james.file_io.slides_james;

import java.io.FileWriter;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");

            writer.write("Hello");

            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
