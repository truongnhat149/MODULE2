import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartServiceImpl implements ShoppingCartService {
    private Map<Integer, CartItem> map = new HashMap<Integer, CartItem>();

    @Override
    public void add(CartItem item) {
        CartItem  existsItem = map.get(item.getProductID());
        if (existsItem != null) {
            existsItem.setQuantily(item.getQuantily() + existsItem.getQuantily());
        } else {
            map.put(item.getProductID(), item);
        }
    }

    @Override
    public void remove(int productID) {
        map.remove(productID);
    }

    @Override
    public Collection<CartItem> getCartItems() {
        return map.values();
    }

    @Override
    public void clear() {
        map.clear();
    }

    public void update(int productID, int quantily) {
        CartItem item = map.get(productID);

        item.setQuantily(quantily + item.getQuantily());

        if (item.getQuantily() <= 0) {
            map.remove(productID);
        }
    }

//    public double getAmount() {
//       return map.values().stream().mapToDouble(item -> item.getQuantily()
//        + item.getPrice());
//    }
}
