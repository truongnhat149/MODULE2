package exercise_james.design_patterns.factory_method;

public class Cat extends Animal{
    @Override
    public String makeSound() {
        return "Meow";
    }
}
