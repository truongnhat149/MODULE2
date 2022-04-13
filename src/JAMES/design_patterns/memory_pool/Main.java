package exercise_james.design_patterns.memory_pool;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Start");
//        gun.fire();
        gun.fireInPool();
        System.out.println("Game over");
        System.out.printf("Tocal bullet created %s" , Bullet.count);

    }
}
