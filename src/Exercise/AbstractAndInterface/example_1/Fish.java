package Exercise.AbstractAndInterface.example_1;

public class Fish extends Animal implements Swimable{
    public Fish() {}

    @Override
    public boolean isSwimable() {
        return false;
    }

}
