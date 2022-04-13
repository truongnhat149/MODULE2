package java_exercise_youtube.rut_tham_trung_thuong.SweepTakes;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SweepTakes_HashSet sweepTakes_hashSet = new SweepTakes_HashSet();
        int option = 0;

        do {
            System.out.println(
            "---------------------------------\n" +
            "--------------Menu---------------\n" +
            "1. Thêm mã số dự thưởng - add bonus code.\n" +
            "2. Xóa mã số dự thưởng - delete coupon code\n" +
            "3. Kiểm tra mã số dự thưởng có tồn tại không? - Check if the coupon code exists\n" +
            "4. Xóa tất cả các phiếu dự thưởng - Delete all backup tickets\n" +
            "5. Số lượng phiếu dự thưởng. - Number of coupon \n" +
            "6. Rút thăm trúng thưởng - Sweepstakes\n" +
            "0. Quay lại chương trình \n"
            );
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    System.out.println("nhập vào mã dự thưởng");
                    String value = sc.nextLine();
                    sweepTakes_hashSet.isMoreVotes(value); // thêm mã số dự thưởng
                    Test.if0();
                case 2:
                    System.out.println("Nhập vào mã dự thưởng bạn muốn xóa - Enter the coupon code you want to delete");
                    String value1 = sc.nextLine();
                    sweepTakes_hashSet.isRemoveVotes(value1);
                    Test.if0();
                case 3:
                    String value2 = sc.nextLine();
                    System.out.println("Kết quả kiểm tra " + sweepTakes_hashSet.isCheckContains(value2));
                    Test.if0();
                case 4:
                sweepTakes_hashSet.isDeleteCoupons();
                    Test.if0();
                case 5:
                    System.out.println("Số lượng: ");
                sweepTakes_hashSet.getQuantily();
                case 6:
                    System.out.println("Rút 1 phiếu");
                    sweepTakes_hashSet.withdrawAVote();
                    if0();
                case 7:
                    sweepTakes_hashSet.printAll();
                    if0();
                case 0:
                    if0();
                    break;
            }
        } while (option == 0);
    }

    public static void if0() {
        Scanner sc = new Scanner(System.in);
        SweepTakes_HashSet sweepTakes_hashSet = new SweepTakes_HashSet();

        String option = "q";

        do {
            System.out.println(
                    "---------------------------------\n" +
                            "--------------Menu---------------\n" +
                            "1. Thêm mã số dự thưởng - add bonus code.\n" +
                            "2. Xóa mã số dự thưởng - delete coupon code\n" +
                            "3. Kiểm tra mã số dự thưởng có tồn tại không? - Check if the coupon code exists\n" +
                            "4. Xóa tất cả các phiếu dự thưởng - Delete all backup tickets\n" +
                            "5. Số lượng phiếu dự thưởng. - Number of coupon \n" +
                            "6. Rút thăm trúng thưởng - Sweepstakes\n" +
                            "0. Quay lại chương trình \n"
            );
            option = sc.nextLine();
//            sc.nextLine();
            switch (option)
            {
                case "1":
                    System.out.println("nhập vào mã dự thưởng");
                    String value = sc.nextLine();
                    sweepTakes_hashSet.isMoreVotes(value); // thêm mã số dự thưởng
                    break;
                case "2":
                    System.out.println("Nhập vào mã dự thưởng bạn muốn xóa - Enter the coupon code you want to delete");
                    String value1 = sc.nextLine();
                    sweepTakes_hashSet.isRemoveVotes(value1);
                    break;
                case "3":
                    String value2 = sc.nextLine();
                    System.out.println("Kết quả kiểm tra " + sweepTakes_hashSet.isCheckContains(value2));
                    break;
                case "4":
                    sweepTakes_hashSet.isDeleteCoupons();
                    Test.if0();
                case "5":
                    System.out.println("Số lượng: ");
                    sweepTakes_hashSet.getQuantily();
                case "6":
                    System.out.println("Rút 1 phiếu");
                    sweepTakes_hashSet.withdrawAVote();
                    if0();
                case "7":
                    sweepTakes_hashSet.printAll();
                    if0();
                default:
                    System.exit(99);
            }
        } while (option.equals("q"));

    }
}
