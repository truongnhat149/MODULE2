package JavaExerciseYouTube.rut_tham_trung_thuong.sweeptakes_treeset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sweeptakes_treeset rt = new Sweeptakes_treeset();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("-----------******-----------");
            System.out.println("----------Menu----------");
            System.out.println("1. Thêm mã số dự thưởng");
            System.out.println("2. Xóa mã số dự thưởng");
            System.out.println("3. kiểm tra mã số dự thưởng có tồn tại không");
            System.out.println("4. xóa tất cả các phiếu dự thưởng");
            System.out.println("5. Số lượng phiếu dự thưởng");
            System.out.println("6. Rút thăm trúng thưởng");
            System.out.println("7. In ra tất cả");
            System.out.println("0. thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
                System.out.println("Nhập vào mã phiếu dự thưởng");
                String giaTri = sc.nextLine();
                if (luaChon == 1) {
                    rt.themPhieu(giaTri);
                } else if (luaChon == 2) {
                    rt.xoaPhieu(giaTri);
                } else {
                    System.out.println("Kết quả kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));
                }
            } else  if (luaChon == 4) {
                rt.xoaTatCaPhieuDuThuong();
            } else if (luaChon == 5) {
                System.out.println("số lượng phiếu là" + rt.laySoluong());
            } else if (luaChon == 6) {
                System.out.println("mã số trúng thưởng" + rt.rutMotPhieu());
            } else if (luaChon == 7) {
                rt.inTatCa();
            }
        } while (luaChon != 0);
    }
}
