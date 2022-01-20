package Exercise.dsa_list.list_simple;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAUT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAUT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    // thêm phần tử vào cuối danh sách
    public void add(E e) {
        if(size == elements.length)
            ensureCapa();
        elements[size++] = e;
    }
    // get() trả về phần tử vừa ở vị trí thứ i trong danh sách
    public E get(int i) {
        if (i >= size || i < 0)
            throw new IndexOutOfBoundsException("Index" + i + ",Size " + i);
        return (E) elements[i];
    }
}
