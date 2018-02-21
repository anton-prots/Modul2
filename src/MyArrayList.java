import java.util.Iterator;

public class MyArrayList <E> implements ArrayInterface<E> {

    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("Second");
        strings.add("Third");
        strings.remove(1);

        System.out.println(strings.get(1));
    }

    private E[]values;
        MyArrayList(){
            values = (E[])new Object[0];
        }

    @Override
    public boolean add(E element) {
       try{
           E[] temp = values;
           values = (E[]) new Object[temp.length+1];
        System.arraycopy(temp, 0,values,0,temp.length);
        values[values.length -1]=element;
        return true;
       }
       catch (ClassCastException e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElement = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElement);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public E get(int index) {
        return values[index];
    }
        @Override
        public Iterator<E> iterator() {
            return new ArrayIterator<>(values);
        }
    @Override
    public boolean add(E element, int index) {
        return true;
    }
}
