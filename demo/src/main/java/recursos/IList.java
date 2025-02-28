package recursos;
public interface IList<T> {
    public int size();
    public boolean isEmpty();
    public void clear();
    public T remove(T value);
    public T add(T value);
    public T get();

}