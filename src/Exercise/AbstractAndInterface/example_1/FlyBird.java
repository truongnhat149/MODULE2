package Exercise.AbstractAndInterface.example_1;

public class FlyBird extends Animal implements Flyable{
    public FlyBird() {}
    @Override
    public boolean isFlyable() {
        return false;
    }
}
