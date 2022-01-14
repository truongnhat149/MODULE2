package Exercise.AbstractAndInterface.Example;

public class Test {
    public static void main(String[] args) {
        Animal animals[] = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
    }
}
