package JavaExerciseYouTube.overiding;

public class Cat extends Animal{
    public Cat() {
       super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("mèo ăn");
    }

    @Override
    public void sleep() {
        System.out.println("mèo ngủ");
    }
}
