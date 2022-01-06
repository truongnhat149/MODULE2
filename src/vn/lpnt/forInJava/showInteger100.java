package vn.lpnt.forInJava;

public class showInteger100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++) {
            if (isPremeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPremeNumber (int n) {
        if (n < 2 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
