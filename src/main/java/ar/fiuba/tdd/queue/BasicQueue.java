package ar.fiuba.tdd.queue;

import ar.fiuba.tdd.linkedlist.*;


public class BasicQueue<T>
        implements Queue<T> {

    private LinkedList<T> items;

    public BasicQueue() {
        items = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void add(T item) {
        items.addLast(item);
    }

    public T top() {
        return items.getFirst();
    }

    public void remove() {
        items.removeFirst();
    }
}