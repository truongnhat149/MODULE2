package product.view;

import product.controller.Manager;
import product.model.Product;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    private Manager manager;
    public View() {
        manager = new Manager();
        mainMenu();
    }

    public void mainMenu() {
        int option;
        while (true) {
            System.out.println("****************");
            System.out.println("1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "0. Thoát");
            System.out.println("****************");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 :
                    manager.add();
                    mainMenu();
                    break;
                case 2 :
                    manager.update();
                    manager.show();
                    break;
                case 3 :
                    manager.delete();
                    manager.show();
                    break;
                case 4 :
                    manager.show();
                    mainMenu();
                    break;
                case 5 :
                    manager.findByName();
                    manager.show();
                    break;
                case 6 :
                    sortByPrice();
                    manager.show();
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("Nhập lại");
            }
        }
    }

    public void sortByPrice() {
        System.out.println("1. Sắp xếp theo chiều tăng dần");
        System.out.println("2. Sắp xếp theo chiều giảm dần");
        System.out.println("0. Về Menu");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Sản phẩm theo chiều tăng dần");
            manager.sortASC();
        } else if (input == 2) {
            System.out.println("Sản phẩm theo chiều giảm dần");
            manager.sortDESC();
        } else
            mainMenu();
    }
}
