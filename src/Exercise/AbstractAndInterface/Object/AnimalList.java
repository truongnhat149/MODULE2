package Exercise.AbstractAndInterface.Object;

import Exercise.AbstractAndInterface.animal.Animal;
import JavaExerciseYouTube.overiding.Dog;

public class AnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public Animal get(int index) {
        return this.animals[index];
    }

    public void add(Animal animal) {
        if(nextIndex < animals.length) {
            animals[nextIndex] = animal;
            System.out.println("Animal added at" + nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        Dog dog = new Dog();
//        animalList.add(dog);

        Animal animal = animalList.get(0);
//        Dog dog2 = (Dog) animal;
//        dog2.getClass();
    }
}
