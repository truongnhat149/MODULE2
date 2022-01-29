package product.controller;

import product.model.Product;
import product.model.SortASC;
import product.model.SortDESC;

import java.util.*;

public class Manager {
    private List<Product> productList;
    private Scanner scanner;

    public Manager() {
        productList = new ArrayList<>();
        this.productList = productList;
        scanner = new Scanner(System.in);
    }

    public boolean exist(int id) {
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                if (product.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public void add() {
        int id;
        String name;
        double price;

        do {
            System.out.println("Nhập id: ");
            id = Integer.parseInt(scanner.nextLine());
            if (exist(id)) {
                System.out.println("Mời nhập lại");
            }
        } while (exist(id));

        System.out.println("Nhập tên sp ");
        name = scanner.nextLine();
        System.out.println("Nhập giá ");
        price = scanner.nextDouble();

        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
    }

    public void update() {
        if (productList.isEmpty()) {
            System.out.println("Không có dữ liệu");
        } else {
            System.out.println("Nhập id muốn sửa");
            int id = scanner.nextInt();

            if (exist(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Sản phẩm có id :" + id + ":" + product);
                        int choice;

                        do {
                            System.out.println("1. Sửa tên");
                            System.out.println("2. Sửa giá");
                            System.out.println("0. Về menu");
                            System.out.println("---------");
                            choice = Integer.parseInt(scanner.nextLine());

                            switch (choice) {
                                case 1 :
                                    System.out.print("New Name: ");
                                    String newName = scanner.nextLine();
                                    product.setName(newName);
                                    break;
                                case 2 :
                                    System.out.println("New price: ");
                                    double newPrice = scanner.nextDouble();
                                    product.setPrice(newPrice);
                                    break;
                                case 0 :
                                    break;
                                default:
                                    System.out.println("Nhập lại");
                            }
                        } while (choice != 0);
                    }
                }
            }
            else
                System.out.println("ID vừa nhập không có trong list ");
        }
    }
    public void delete() {
        System.out.println("Nhập id sản phẩm: ");
        int id = scanner.nextInt();
        if (exist(id)) {
            for (Product product : productList) {
                if (product.getId() == id) {
                    System.out.println("Sản phẩm bạn muốn xóa :" + product.toString());
                    productList.remove(product);
                }
            }
        } else
            System.out.println("Không có sản phẩm trong list ");
    }

    public void show() {
        int i = 1;
        for (Product product :productList) {
            System.out.println("sản phẩm : " + product.toString());
            i++;
        }
    }

    public void findByName() {
        System.out.println("Nhập tên muốn tìm kiếm");
        String name = scanner.nextLine();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println("Sản phẩm bạn muốn tìm" + product.toString());
            } else
                System.out.println("Không có");
        }
    }

    public void sortASC() {
        System.out.println("Sản phẩm sắp xếp theo chiều tăng dần ");
        SortASC sortASC = new SortASC();
        Collections.sort(productList, sortASC);
        int i = 1;
        for (Product product :productList) {
            System.out.println(i + ": " + product.toString());
            i++;
        }
    }
    public void sortDESC() {
        System.out.println("Sản phẩm sắp xếp theo chiều giảm dần");
        SortDESC sortDESC = new SortDESC();
        Collections.sort(productList, sortDESC);
        int i = 1;
        for (Product product : productList) {
            System.out.println(i + ": " + product.toString());
            i++;
        }
    }
}
