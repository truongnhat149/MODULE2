package from_java67_file.java_get_folder_apps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        String tenFile = sc.nextLine();
        GetFile getFile = new GetFile(tenFile);

        do {
            System.out.println("----------------");
            System.out.println("1. kiểm tra file có thể thực thi");
            System.out.println("2. Kiểm tra file có thể đọc");
            System.out.println("3. Kiểm tra file có thể ghi");
            System.out.println("4. in đường dẫn");
            System.out.println("5, in tên file");
            System.out.println("6. kiểm tra file là thư mục hoặc tập tin");
            System.out.println("7. in ra danh sách các file con");
            System.out.println("8. in ra cây thư mục");
            System.out.println("0. thoát chương trình");

            option = sc.nextInt(); sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("File có thể thực thi" + getFile.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println("file có thể đọc" + getFile.kiemTraDoc());
                    break;
                case 3:
                    System.out.println("file có thể ghi: " + getFile.kiemTraGhi());
                    break;
                case 4:
                    System.out.println("in đường dẫn" );
                    getFile.inDuongDan();
                    break;
                case 5:
                    System.out.println("in tên file");
                    getFile.inTen();
                    break;
                case 6:
                    getFile.kiemTraLaThuMucHayLaTapTin();
                    break;
                case 7:
                    getFile.inDanhSachCacFileCon();
                    break;
                case 8:
                    System.out.println("Danh sách thư mục con là");
                    getFile.inCayThuMuc();
                    break;

            }
        } while(option != 0);
    }
}
