package java_exercise_youtube.overiding;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Chó ăn");
    }

    @Override
    public void sleep() {
        System.out.println("Chó ngủ");
    }
}
