package recursos;

public class List<T> implements IList<T>{
    protected int count; 

    public AbstractList() {
        this.count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void clear() {
        count = 0;
    }

    @Override
    public abstract T remove(T value);

    @Override
    public abstract T add(T value);

    @Override
    public abstract T get();
}