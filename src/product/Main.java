package product;

import product.controller.Manager;
import product.model.Product;
import product.view.View;

public class Main {
    public static void main(String[] args) {
        Product product_1  = new Product(1,"Iphone", 400000);
        Product product_2  = new Product(2,"Iphone", 400000);
        Product product_3  = new Product(3,"Iphone", 400000);

        Manager manager = new Manager();
        manager.add();
        new View();
    }
}
