package exercise_james.abstract_and_interface.animal;

public class Test {
    public static void main(String[] args) {
        Animal animals[] = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit fruits[] = new Fruit[2];
        fruits[0] = new Orangle();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
            if (fruit instanceof Apple) {
                System.out.println(fruit.howtoEat());
            }
        }
    }
}
