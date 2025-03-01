package recursos;

public abstract class ListaStack<T> extends AbstractStack<T>{
    private Nodo<T> top; // Referencia al nodo superior

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    @Override
    public void push(T item) {
        Nodo<T> nuevoNodo = new Nodo<>(item);
        nuevoNodo.siguiente = top;
        top = nuevoNodo;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new IllegalStateException("La pila está vacía");
        T dato = top.dato;
        top = top.siguiente;
        size--;
        return dato;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("La pila está vacía");
        return top.dato;
    }
}  
