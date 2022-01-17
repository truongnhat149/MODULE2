package JavaExerciseYouTube.minigame_TaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        // tao tai khoan cho ng choi
        double taiKhoanNguoiChoi = 5000;
        Scanner sc = new Scanner(System.in);

        //locale xác định xem đang ở nước nào
        Locale locale = new Locale("vi", "VN");
        // number format giúp làm đẹp con số, để ng dùng dễ nhìn
        // NumberFormat numberFormat = NumberFormat.getInstance(locale);
        // format number theo từng quốc gia, vd: vn : vnd - mỹ : $

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        // bắt đầu
        int luaChon = 1;

        do {
            // thiết kế giao diện bắt đầu
            System.out.println("mời bạn lựa chọn");
            System.out.println("Nhấn phím 1 để bắt đầu");
            System.out.println("Nhấn phím bất kì để thoát");

            luaChon = sc.nextInt();

            // cấp tài khoản
            if (luaChon  == 1) {
                System.out.println("Bắt đầu");
                System.out.println("Tài khoản của bạn: " + numberFormat.format(taiKhoanNguoiChoi) + "   , mời nhập tiền cược : ");
                double datCuoc = 0;

                // nhập số tiền cược
                do {
                    System.out.println("Đặc cược số tiền > 0 và < số tiền cược: " + numberFormat.format(taiKhoanNguoiChoi) + ":");
                    datCuoc = sc.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                // chọn tài - xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("Chọn 1: Xỉu -- 2: Tài");
                     luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);


                // Tung xúc sắc

                double xucXac1 = Math.floor(Math.random() * 5 + 1);
                double xucXac2 = Math.floor(Math.random() * 5 + 1);
                double xucXac3 = Math.floor(Math.random() * 5 + 1);
                double tong = xucXac1 + xucXac2 + xucXac3;

                // tính toán kết quả;

                System.out.println("Kết quả: " + xucXac1 + "-" + xucXac2 + "-" + xucXac3);
                // trả về tài - xỉu - cái ăn (trường hợp 3 con xúc xắc là 1 và 6 thì cái ăn
                if (tong == 3 && tong == 18)
                {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("tổng là " + tong + " nhà cái ăn tất, bạn thua ");
                    System.out.println("Tài khoản hiện tại: " + numberFormat.format(taiKhoanNguoiChoi));
                }

                else if (tong >= 4 && tong <= 10) // nằm trong khoảng 4-10 xỉu
                {
                    System.out.println("tong là" + tong + " => xỉu");
                    if (luaChonTaiXiu == 1) {
                        System.out.println(" bạn thắng: ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Số tiền hiện tại: " + numberFormat.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println(" bạn thua: ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("tài khoản hiện tại" + numberFormat.format(taiKhoanNguoiChoi));
                    }
                }
                else // ngược lại 11-17 tài
                {
                    System.out.println("Tổng là:" + tong + " => tài ");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Bạn thắng: ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("số tiền hiện tại: " + numberFormat.format(taiKhoanNguoiChoi));
                    } else  {
                        System.out.println("bạn thua: ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println(" số tiền hiện tại: " + numberFormat.format(taiKhoanNguoiChoi));
                    }
                }
            }// nhập lựa chọn khác 1 thì do còn làm - =1 thì thôi
        } while(luaChon == 1);

    }

    public void capTaiKhoan() {

    }
}
