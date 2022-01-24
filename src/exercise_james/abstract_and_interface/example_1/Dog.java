package exercise_james.abstract_and_interface.example_1;

public class Dog extends Animal implements Brakable, Runable{
    private String name;
    public Dog() {}
    public Dog(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isBarkable() {
         return true;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "is barkable " + isBarkable() +
                '}';
    }

    @Override
    public boolean isRunable() {
        return true;
    }
}
