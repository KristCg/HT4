package recursos;
public interface IList<T> {
    public int size();
    public boolean isEmpty();
    public void clear();
    public void addFirst(T value);
    public void addLast(T value);
    public T getFirst();
    public T gatLast()
    public T removeFirst()
    public T removeLast()
    public T remove(T value);
    public void add(T value);
    public T remove();
    public T get();
    public boolean contains(T value);
    public int indexOf(T value);
    public int lastIndexOf(T value);
}