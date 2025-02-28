package recursos;

public abstract class AbstractList<T> extends AbstractStructure<E> implements IList<T>{
    public AbstractList(){}
    public boolean isEmpty(){
        return size() == 0;
    }

    public void addFirst(T value){
        add(0, value);
    }

    public void addLast(
        add(size(), value);
    )

    public T getFirst(){
        return get(0);
    }

    public T getLast(){
        return get(size() -1);
    }

    public T removeFirst(){
        return remove(0);
    }

    public T removeLast(){
        return remove(size()-1);
    }

    public void add(T value){
        addLast(value);
    }

    public T remove(){
        return removeLast();
    }

    public T get(){
        return getLast();
    }

    public boolean contains(T value){
        return indexOf(value) != -1;
    }
}