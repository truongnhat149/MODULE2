package Exercise.abstract_and_interface.Example;

public  class Chicken extends Animal implements Edible{
    public final String eat() {
        return "ooooo";
    }
    @Override
    public String makeSound() {
        return "chicken: o0oooo0ooo0oo";
    }

    @Override
    public String howtoEat() {
        return "Chicken: cuc tac cuc tac";
    }
}
