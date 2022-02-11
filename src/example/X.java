package example;

public class X {
    public static void main(String [] args) {
        String x = "1,2,3,4,5,6";
        String[] y = x.split(",");
        int tong = 0;
        for (String z : y) {
            int so = Integer.parseInt(z);
            if (so % 2 == 0) {
                tong += so;
            }
        }

        System.out.println(tong);
    }
}