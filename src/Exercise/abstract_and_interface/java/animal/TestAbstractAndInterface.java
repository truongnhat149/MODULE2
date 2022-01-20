package Exercise.abstract_and_interface.java.animal;


import Exercise.abstract_and_interface.java.animal.Edible.Apple;
import Exercise.abstract_and_interface.java.animal.Edible.Edible;
import Exercise.abstract_and_interface.java.animal.Edible.Fruit;
import Exercise.abstract_and_interface.java.animal.Edible.Orange;

public class TestAbstractAndInterface {
    public static void main(String[] args) {
        Animal animals[] = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit fruits[] = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for(Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
