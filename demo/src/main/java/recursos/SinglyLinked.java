package recursos;

public class SinglyLinked<T> implements AbstractList<T>{
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    protected int count;
    protected Node<T> head;

    public SinglyLinked(){
        head = null;
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        head = null;
        count = 0;
    }

    @Override
    public void add(int index, T value) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = current.next.next;
        }
        count--;
        return removedData;
    }
}