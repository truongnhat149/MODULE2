package exercise_james.java_collection_framework.example_in_james;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratorr {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("vn");
        collection.add("japan");
        collection.add("indo");
        collection.add("malai");
        collection.add("thailand");
        collection.add("cambodia");
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toLowerCase() + " ");
        }
    }
}
