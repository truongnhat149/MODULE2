package Exercise.abstract_and_interface.Example.Quiz;

public class TruongPhong extends NhanVien {
    public double trachNhiem;

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public void xuat() {
        super.hoTen = "Tuấn";
        super.luong = 500;
        super.xuat();
        double thuNhap = super.getThuNhap();
    }
}
