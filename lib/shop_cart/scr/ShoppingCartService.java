import java.util.Collection;

public interface ShoppingCartService {
    void add(CartItem item);
    void remove(int productID);
    Collection<CartItem> getCartItems();
    void clear();
}
