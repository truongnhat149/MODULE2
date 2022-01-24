package exercise_james.java_collection_framework.example_in_james;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();

        collection.add("vn");
        collection.add("VietNam");
        collection.add("Nhat Truong");
        collection.add("Le phung");
        collection.add("C1121");

        System.out.println("A list");
        System.out.println(collection);

        System.out.println("có chữ Le phung trong mảng không?: " +
                collection.contains("Le phung"));

        System.out.println("mảng trên chứa bao nhiêu phần từ " + collection.size());

        ArrayList c1 = (ArrayList) collection.clone();

        c1.addAll(collection);
        System.out.println("c1 đang add hết phần tử của collection: " + c1);
        System.out.println("xóa tất cả của c1");
        c1 = (ArrayList) collection.clone();
        c1.removeAll(collection);
        System.out.println("test xem nó có xóa mảng của collection không?");
        System.out.println(c1);
        System.out.println(collection);
    }
}
