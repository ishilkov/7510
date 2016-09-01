package ar.fiuba.tdd.queue;

import ar.fiuba.tdd.linkedlist.EmptyElementException;

public interface Queue<T> {

    boolean isEmpty();

    int size();

    /**
     * Adds the item to the end of queue.
     * @param item Item to add.
     */
    void add(T item);

    /**
     * Returns first element in queue.
     * @return First item in the queue.
     * @throws EmptyElementException Empty queue exception.
     */
    T top() throws EmptyElementException;

    /**
     * Removes first item in queue.
     * @throws EmptyElementException Empty queue exception.
     */
    void remove() throws EmptyElementException;

}