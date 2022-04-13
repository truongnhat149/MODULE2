package json.simple_student;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonSimple {
    public static void main(String[] args) {
       FileReader reader = null;

        try {
            reader = new FileReader("data/simple.json");

            Type classOfT = new TypeToken<ArrayList<ClassRoom>>(){}.getType();
            Gson gson = new Gson();
            ArrayList<ClassRoom> list = gson.fromJson(reader, classOfT);

            for (ClassRoom classRoom : list) {
                classRoom.display();
            }
       } catch (FileNotFoundException ex) {
           Logger.getLogger(JsonSimple.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
           if (reader != null) {
               try {
                    reader.close();
               } catch (IOException ex) {
                   Logger.getLogger(JsonSimple.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
    }
}
