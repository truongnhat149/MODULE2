import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
    private static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1, "hat", 20, 200));
        list.add(new Product(2, "Shoes", 20, 200));
        list.add(new Product(3, "T-Shirt", 20, 200));
        list.add(new Product(4, "Skritl", 20, 200));
        list.add(new Product(5, "Vay", 20, 200));
        list.add(new Product(6, "Coat", 20, 200));
    }
    public void add(Product product) {
        list.add(product);
    }

    public void remove(int productID) {
        list.removeIf(item -> item.getProductID() == productID);
    }

    public List<Product> findAll() {
        return list;
    }

    public void update(Product product) {
        for (int i = 0; i < list.size(); i++) {
            Product item = list.get(i);
            if (item.getProductID() == product.getProductID()) {
                list.set(i, product);
                break;
            }
        }
    }
}
