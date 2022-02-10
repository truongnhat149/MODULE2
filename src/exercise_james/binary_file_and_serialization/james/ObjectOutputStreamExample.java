package exercise_james.binary_file_and_serialization.james;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\JAVA\\2code\\src\\exercise_james\\binary_file_and_serialization\\james\\data\\product.txt"));
            ObjectInputStreamAndObjectOutputStream.Product product = new ObjectInputStreamAndObjectOutputStream.Product(1, "IPhone 12", 2800000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }
}
