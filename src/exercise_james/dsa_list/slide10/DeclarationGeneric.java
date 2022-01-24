package exercise_james.dsa_list.slide10;

public class DeclarationGeneric<T> {
    private static final int INITIAL_SIZE = 16;
    private T[] elements;
    private int count = 0;

    public DeclarationGeneric()
    {
        this.elements = (T[]) new Object[INITIAL_SIZE];
    }

    public void add(T element) {
        this.elements[count++] = element;
    }
}
