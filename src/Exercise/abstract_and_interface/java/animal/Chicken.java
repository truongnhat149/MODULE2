package Exercise.abstract_and_interface.java.animal;

import Exercise.abstract_and_interface.java.animal.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chiken : ooOOOOoooo";
    }

    @Override
    public String howtoEat(){
        return "Chicken eat : oooo";
    }
}
