
public class CartItem {
    private int productID;
    private String name;
    private int quantily;
    private double price;

    public CartItem(int productID, String name, int quantily, double price) {
        this.productID = productID;
        this.name = name;
        this.quantily = quantily;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", quantily=" + quantily +
                ", price=" + price +
                '}';
    }
}
