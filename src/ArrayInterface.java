public interface ArrayInterface <E> extends Iterable <E>{
    boolean add(E element);
    boolean add(E element, int index);
    E get (int index);
    void remove (int index);

}
