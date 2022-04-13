package exercise_james.design_patterns.factory_method;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if("canine".equals(type)) {
            return new Dog();
        } else
            return new Cat();
    }
}
