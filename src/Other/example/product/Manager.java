package example.product;

import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

    static LinkedList<Product> productList;
    public Manager() {
        LinkedList<Product> productList = new LinkedList<>();
        this.productList = productList;
    }

    public boolean isHadProductInList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.equals(product))
                    return true;
            }
        }
        return false;
    }

    public static void addProduct() {
        int id;
        String name;
        double price;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Nhập id: ");
            id = input.nextInt();
            if (isHadIdInList(id)) {
                System.out.println("Id đã có, mời nhập lại");
            }
        } while (isHadIdInList(id));

        do {
            System.out.println();
            name = input.nextLine();
            if (isHadProductWithName(name)) {
                System.out.println("tên đã có, mời nhập lại");
            }
        } while (isHadProductWithName(name));

        System.out.println("Product price");
        price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
    }

    public static boolean isHadIdInList(int id) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getId() == id) {
                    System.out.println("Đã có id! mời bạn nhập lại");
                    mainMenu();
                    return true;
                    // bắt nhập lại
                }
            }
        }
        return false;
    }

    public static boolean isHadProductWithName(String name) {
        if(!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getName().equalsIgnoreCase(name)) {
                    System.out.println("Đã có tên trong list");
                    // bắt nhập lại
                    mainMenu();
                    return true;
                }
            }
        }
        return false;
    }

    public static void editProductWithId() {
        if (productList.isEmpty()) {
            System.out.println("Chưa có dữ liệu, mời quay lại và add product ");
        } else {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập id muốn edit :");
                int inputId = sc.nextInt();

                if (isHadIdInList(inputId)) {
                for (Product products : productList) {
                    if (products.getId() == inputId) {
                        System.out.println("Sản phẩm có id  : " + inputId + products);
                        char choice;

                       do {
                           System.out.println("Menu");
                           System.out.println("1. Chỉnh tên ");
                           System.out.println("2. Chỉnh id");
                           System.out.println("3. Chỉnh giá sản phẩm");
                           System.out.println("0. Back menu");
                           System.out.println("---------------");
                           choice = sc.nextLine().charAt(0);

                           switch (choice) {
                               case '1' :
                                   System.out.println("Nhập tên");
                                   String inputName = sc.nextLine();
                                   products.setName(inputName);
                                   break;
                               case '2' :
                                   System.out.println("Nhập id");
                                   int id = sc.nextInt();
                                   products.setId(id);
                                   break;
                               case '3' :
                                   System.out.println("Chinh giá sp");
                                   int price = sc.nextInt();
                                   products.setPrice(price);
                                   break;
                               case '0' :
                                    mainMenu();
                           }

                       } while (choice != '0');
                    }
                }
            }
        }
    }

    public static void mainMenu() {
        System.out.println("Menu");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Chỉnh sản phẩm");
        System.out.println("3. Xóa 1 sản phẩm");
        System.out.println("4. Hiển thị sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm ");
        System.out.println("6. Sắp xếp sản phẩm theo chiều tăng dần");
        System.out.println("7. Sắp xếp sản phẩm theo chiều giảm dần");
        System.out.println("0. Exit");
        System.out.println("----------------------");

        Scanner scanner = new Scanner(System.in);
        char choice = scanner.nextLine().charAt(0);

        do {
            switch (choice) {
                case '1' :
                    addProduct();
                    break;
                case '2' :
                    editProductWithId();
                    break;
                case '3' :
                    removeProductWithId();
                    break;
                case '4' :
                    displayProduct();
                    break;
                case '5' :
                    findProductWithName();
                    break;
                case '6' :
                    sortAscendingProduct();
                    break;
                case '7' :
                    sortDescendingProduct();
                    break;
            }
        } while (choice != '0');
    }

    public static void sortDescendingProduct() {
    }

    public static void sortAscendingProduct() {
    }

    public static void findProductWithName() {

    }

    public static void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println(" Chưa có dữ liệu ");
        } else {
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + "." + product.toString());
                i++;
            }
        }
    }

    public static void removeProductWithId() {
        if(productList.isEmpty()) {
            System.out.println("Chưa có dữ liệu");
        } else {
            Scanner input = new Scanner(System.in);
            int id = input.nextInt();
            System.out.println("Nhập id sản phẩm muốn xóa");
            if (isHadIdInList(id)) {
                for (Product products : productList) {
                    if (products.getId() == id) {
                        System.out.println("Sản phẩm muốn xóa " + products.toString());
                        productList.remove(products);
                    }
                }
            } else {
                System.out.println("Id không có trong list ");
            }
        }
    }


    public static void main(String[] args) {
        Product product1 = new Product(1, "samsung", 12333333);
        Product product2 = new Product(2, "iphone", 34444444);
        Product product3 = new Product(3, "honda", 233333333);

        mainMenu();
    }
}
