package java_exercise_youtube.java_map_tudien.tree_map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---------------");
            System.out.println("Menu");
            System.out.println("Tra từ điển Anh - Việt \n"
            +   "1. thêm từ ( từ khóa, ý nghĩa \n"
            +   "2. Xóa từ \n"
            +   "3. Tìm ý nghĩa của từ khóa => Tra từ \n"
            +   "4. In ra danh sách \n"
            +   "5. In ra số lượng từ \n"
            +   "6. Xóa tất cả các từ khóa \n"
            +   "0. Out khỏi chương trình");

            luaChon = sc.nextInt(); sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập từ khóa");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhập vào ý nghĩa");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            } else if (luaChon == 2 || luaChon == 3) {
                System.out.println("Nhập vào từ khóa");
                String tuKhoa = sc.nextLine();
                if (luaChon == 2) {
                    tuDien.xoaTu(tuKhoa);
                } else
                    System.out.println("ý nghĩa là: " + tuDien.traTu(tuKhoa));
            } else if (luaChon == 4) {
                tuDien.inTuKhoa();
            } else if (luaChon == 5) {
                System.out.println("Số lượng từ khóa là :" + tuDien.laySoLuong());
            } else {
                tuDien.xoaTaCa();
            }
        } while (luaChon != 0);
    }
}
