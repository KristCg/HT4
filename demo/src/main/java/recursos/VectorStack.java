package recursos;

import java.util.Vector;

public abstract class VectorStack<T> extends AbstractStack<T>{
    private Vector<T> stack = new Vector<>();

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
        return stack.lastElement();
    }
}
