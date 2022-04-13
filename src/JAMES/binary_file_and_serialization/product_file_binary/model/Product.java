package exercise_james.binary_file_and_serialization.product_file_binary.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private String manuafacturer;
    private double price;
    private String otherDesCription;

    public Product(int id, String nameProduct, String manuafacturer, double price, String otherDesCription) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.manuafacturer = manuafacturer;
        this.price = price;
        this.otherDesCription = otherDesCription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManuafacturer() {
        return manuafacturer;
    }

    public void setManuafacturer(String manuafacturer) {
        this.manuafacturer = manuafacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDesCription() {
        return otherDesCription;
    }

    public void setOtherDesCription(String otherDesCription) {
        this.otherDesCription = otherDesCription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", manuafacturer='" + manuafacturer + '\'' +
                ", price=" + price +
                ", otherDesCription='" + otherDesCription + '\'' +
                '}';
    }
}
