package example;

public class GetEvent1000 {
    public static void main(String[] args) {
        int sum = 0;
        //Your code here
        for (int i = 0; i < 1000; i++ ) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
