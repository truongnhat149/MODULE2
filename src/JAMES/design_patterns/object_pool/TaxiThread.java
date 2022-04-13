package exercise_james.design_patterns.object_pool;

import java.util.concurrent.TimeUnit;
import java.util.Random;

public class TaxiThread implements Runnable {
    private TaxiPool taxiPool;

    public TaxiThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        takeTaxi();
    }

    private void takeTaxi() {
        try {
            System.out.println("New Clinet "  + Thread.currentThread().getName());
            Taxi taxi = taxiPool.getTaxi();
            TimeUnit.MICROSECONDS.sleep(randInt(1000, 1500));
        } catch (InterruptedException | TaxiNotFoundException e) {
            System.out.println("Rejected the client: " + Thread.currentThread().getName());
        }
    }

    private int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min ;
    }
}
