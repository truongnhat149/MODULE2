package Exercise.AbstractAndInterface.Example;

public abstract class Fruit implements Edible{
    public final void get(){
        System.out.println();
    }
    @Override
    public String howtoEat() {
        return "Fruit: ----";
    }
}
