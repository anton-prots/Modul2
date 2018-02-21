import java.util.Iterator;

public class ArrayIterator <E> implements Iterator {

    private int index = 0;
    E[]values;

    public ArrayIterator(E[] values) {
    }

    @Override
    public boolean hasNext() {
        return index<values.length;
    }

    @Override
    public E next() {
        return values [index++];
    }
}
