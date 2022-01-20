package java_exercise_youtube.rut_tham_trung_thuong.SweepTakes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SweepTakes_HashSet {
    // wincoupons thùng phiếu dự thưởng
    Set<String> wincoupons = new HashSet<String>();

    public SweepTakes_HashSet() {

    }

    public boolean isMoreVotes(String value) {
        return this.wincoupons.add(value);
    }

    public boolean isRemoveVotes(String value) {
        return this.wincoupons.remove(value);
    }

    public boolean isCheckContains(String value) {
        return this.wincoupons.contains(value);
    }

    public void isDeleteCoupons() {
         this.wincoupons.clear();
    }

    public int getQuantily() {
        return this.wincoupons.size();
    }

    public String withdrawAVote() {
        String result = "";
        Random random = new Random();
        int index = random.nextInt(this.wincoupons.size());
        result = (String) this.wincoupons.toArray()[index];
        return result;
    }

    public void printAll() {
        System.out.println(Arrays.toString(this.wincoupons.toArray()));
    }
}
