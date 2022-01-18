package JavaExerciseYouTube.rut_tham_trung_thuong.sweeptakes_treeset;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Sweeptakes_treeset {
    Set<String> thungPhieuDuThuong = new TreeSet<String>();

    public Sweeptakes_treeset() {}
    // thêm giá trị = add
    public boolean themPhieu(String giaTri) {
        return this.thungPhieuDuThuong.add((giaTri));
    }

    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri) {
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaTatCaPhieuDuThuong() {
         this.thungPhieuDuThuong.clear();
    }

    public int laySoluong() {
        return this.thungPhieuDuThuong.size();
    }

    public String rutMotPhieu() {
        String ketQua = "";
        double v = Math.floor(Math.random() * thungPhieuDuThuong.size() + 1);
        return ketQua + v;
    }

    public void inTatCa() {
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }
}
