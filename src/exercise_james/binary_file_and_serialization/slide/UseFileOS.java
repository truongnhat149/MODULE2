package exercise_james.binary_file_and_serialization.slide;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFileOS {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 7, 11};

        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);

            for (int i = 0; i < a.length; i++) {
                dout.writeInt(a[i]);
            }
            dout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
