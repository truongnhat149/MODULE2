package from_java_youtube_file.java_get_folder_apps;

import java.io.File;

public class GetFile {
    File file;

    public GetFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi() {
        // kiểm tra file có thực thi không?
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        // canRead kiểm tra xem file có thực thi không?
        return this.file.canRead();
    }
    public boolean kiemTraGhi() {
        // canWrite kiểm tra xem file có thể viết được hay không?
        return this.file.canWrite();
    }

    public void inDuongDan() {
        // getAbsolutePath in ddwuognf dẫn ra
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen() {
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMucHayLaTapTin() {
        if (this.file.isDirectory()) {
            System.out.println("Đây là thư mục");
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin");
        }
    }

    public void inDanhSachCacFileCon() {
        if (this.file.isDirectory()) {
            System.out.println(" Các tập tin ở file con là");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin, không có dữ liệu bên trong");

        }
    }

    public void inCayThuMuc() {
        this.inChiTietCayThuMuc(this.file, 1);
    }

    public void inChiTietCayThuMuc(File f, int cap_bac) {
        for (int i = 0; i < cap_bac ; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThuMuc(fx, cap_bac + 1);
            }
        }
    }
}
