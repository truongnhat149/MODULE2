package product.model;

import product.model.Product;

import java.util.Comparator;

public class SortDESC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
