package exercise_james.thread.find_prime;

import java.util.stream.Stream;

public class OptimizedPrimeFactorization implements Runnable {
    int numRanger;

    public OptimizedPrimeFactorization() {
        this.numRanger = 0;
    }

    public OptimizedPrimeFactorization(int num) {
        this.numRanger = num;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num == 3) return true;
        int maxRanger = (int) (Math.floor(Math.sqrt(num)));
        for (int i = 2; i <= maxRanger; i++) {
            if (num % 2 == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        String str = "";
        try {
            int i  = 2;
            if (i > numRanger) {
                str = "Not have number prime";
            } else {
                str = "List prime numbers ";
                int count = 0;
                while (i <= numRanger) {
                    if (isPrime(i)) {
                        count++;
                        str += i + " " ;
                        System.out.println("Optimized Prime");
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("complete Optimized Prime");
        System.out.println(str);
    }
}
