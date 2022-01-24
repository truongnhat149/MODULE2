package exercise_james.java_collection_framework.product_arraylist_linkedlist.product_linkedlist;

import java.util.Comparator;

public class PriceDescreaseComparator implements Comparator<Product> {

    @Override
    public int compare(Product productOne, Product productTwo) {
        if (productTwo.getPrice() > productOne.getPrice()) {
            return 1;
        } else if (productTwo.getPrice() == productOne.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
