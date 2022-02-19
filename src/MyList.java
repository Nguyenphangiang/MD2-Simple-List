import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private int defaultCapacity = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[defaultCapacity];
    }
    private void ensureCape(){
        int newSize  = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCape();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size "  + i);
        }
        return (E) elements[i];
    }
}
