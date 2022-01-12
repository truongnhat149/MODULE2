package Exercise;

public class main {
    public static void main(String[] args) {


            Animal animal = new Animal();

            animal.speak();


    }
    public static class Animal {
    public Animal() {}

        private void speak(){

            System.out.println("Hello");

        }

    }
}