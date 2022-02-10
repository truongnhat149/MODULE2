package exercise_james.binary_file_and_serialization.product_file_binary.Process;

import exercise_james.binary_file_and_serialization.product_file_binary.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFileText {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"sunlight", "Sun", 4000, "Sạch đẹp"));
        products.add(new Product(2,"sunlight", "Sun", 4000, "Sạch đẹp"));
        products.add(new Product(3,"sunlight", "Sun", 4000, "Sạch đẹp"));
        products.add(new Product(4,"sunlight", "Sun", 4000, "Sạch đẹp"));
        String path = "src\\exercise_james\\binary_file_and_serialization\\product_file_binary\\data\\products.txt";
        writeToFile(path,products);
        List<Product> productsDataFrom = readDataFormFile(path);
        for (Product product : productsDataFrom) {
            System.out.println(product);
        }
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFormFile(String Path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(Path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }


}
