package dequy;

public class DeQuy_CountDown {
    private int num;
    public int countDown(int num) {
        if (num > 0) {
            System.out.println("gia tri" + num);
            return countDown(num - 1);
        }
        return num;
    }

    public static void main(String[] args) {
        DeQuy_CountDown deQuy = new DeQuy_CountDown();
        deQuy.countDown(6);
    }
}
