package exercise_james.binary_file_and_serialization.slide;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExampleObjOS {
    public static void main(String[] args) throws IOException {
        try {
            ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("object.dat"));
            OOS.writeUTF("John");
            OOS.writeDouble(85.5);
            OOS.writeObject(new java.util.Date());
        } finally {

        }
    }
}
