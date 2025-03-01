package recursos;

import java.util.ArrayList;

public abstract class ArrayListStack<T> extends AbstractStack<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    @Override
    public void push(T item) {
        stack.add(item);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new IllegalStateException("La pila está vacía");
        size--;
        return stack.remove(stack.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("La pila está vacía");
        return stack.get(stack.size() - 1);
    }
}