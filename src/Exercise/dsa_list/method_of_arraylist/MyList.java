package Exercise.dsa_list.method_of_arraylist;

import java.util.Arrays;


public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] elements;

    public MyList() {
        elements =   new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements =  new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        if (size >= elements.length) {
            int newSize = minCapacity ;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public boolean add(E element) {
        if (size == elements.length) {
            return false ;
        }
        elements[size++] = element; //  elements[size] = element , sau do size+=1 ;
        return true ;
    }


    public void add(int index, E element) {
        ensureCapacity(elements.length);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds") ;
    }

    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }
    public int size(){
        return this.size  ;
    }

    @Override
    public MyList clone() {
        MyList<E> clone = new MyList<E>(elements.length);
        for (E e : (E[]) elements) {
            clone.add(e);
        }
        return clone;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }

    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--) if (e.equals(elements[i])) return i;
        return -1;
    }


    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public E get(int index){
        if (index >= size|| index < 0){
            throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) elements[index] ; // vi moi element la  1 object
    }

    public void printMyList(){
        int i = 0 ;
        for( E e : (E[]) elements){
            System.out.println( "Element " + i +" : " + e);
            i++;
        }
    }

}
