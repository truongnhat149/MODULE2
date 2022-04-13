package exercise_james.abstract_and_interface.animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: o0oooo";
    }

    @Override
    public String howtoEat() {
        return "Chicken eat fruit";
    }
}
