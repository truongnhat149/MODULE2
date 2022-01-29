package example.product;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = this.price;
    }

    public String toString() {
        return "Name : " + getName() +
                "Id : " + getId() +
                "Price:  " + getPrice();
    }
}
