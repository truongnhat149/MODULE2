package product.model;

import product.model.Product;

import java.util.Comparator;

public class SortASC implements Comparator<Product> {
    @Override
//    public int compare(Product o1, Product o2) {
//        return Double.compare(o1.getPrice(), o2.getPrice());
//    }
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
