package javax_swing.mvc.model;

public class CounterModel {
    private int value;

    public CounterModel() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void increament() {
        this.value++;
    }
    public void decrement() {
        this.value--;
    }
    public void reset() {
        this.value = 0;
    }
}
