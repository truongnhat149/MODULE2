package example;

public class TestOOP {
    public class NhanVien {
        public double getThuNhap() {

            return 0;
        }
    }
    public class TruongPhong extends NhanVien {
        public double getThuNhap() {

            return 1;
        }
    }

    public static void main(String[] args) {
        TestOOP.NhanVien nv1 = new TestOOP(). new NhanVien();
        TestOOP.NhanVien nv2 = new TestOOP(). new TruongPhong();
        TestOOP.TruongPhong nv3 = new TestOOP().new TruongPhong();
    }
}
