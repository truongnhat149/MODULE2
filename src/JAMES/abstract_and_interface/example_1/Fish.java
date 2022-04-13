package exercise_james.abstract_and_interface.example_1;

public class Fish extends Animal implements Swimable{
    public Fish() {}

    @Override
    public boolean isSwimable() {
        return false;
    }

}
