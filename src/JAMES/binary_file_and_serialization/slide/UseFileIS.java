package exercise_james.binary_file_and_serialization.slide;

import java.io.*;

public class UseFileIS {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            DataInputStream din = new DataInputStream(fin);
            while (true) {
                System.out.println(din.readInt());
            }
        } catch (EOFException ex) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
