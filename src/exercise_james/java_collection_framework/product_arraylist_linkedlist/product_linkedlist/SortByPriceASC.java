package exercise_james.java_collection_framework.product_arraylist_linkedlist.product_linkedlist;

import java.util.Comparator;

public class SortByPriceASC implements Comparator<Product> {

    @Override
    public int compare(Product productOne, Product productTwo) {
//        return productOne.getPrice() - productTwo.getPrice();
        if (productOne.getPrice() < productTwo.getPrice()) {
            return -1;
        } else if (productOne.getPrice() == productTwo.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }
}
