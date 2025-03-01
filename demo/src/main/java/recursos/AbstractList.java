package recursos;

public abstract class AbstractList<T> implements IList<T> {

    public AbstractList() {}

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void addFirst(T value) {
        add(0, value);
    }

    @Override
    public void addLast(T value) {
        add(size(), value);
    }

    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(size() - 1);
    }

    @Override
    public T removeFirst() {
        return remove(0);
    }

    @Override
    public T removeLast() {
        return remove(size() - 1);
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    public abstract void add(int index, T value);
    public abstract T get(int index);
    public abstract T remove(int index);
}
