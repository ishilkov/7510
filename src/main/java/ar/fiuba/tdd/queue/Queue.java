package ar.fiuba.tdd.queue;

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
     * @throws AssertionError Empty queue exception.
     */
    T top();

    /**
     * Removes first item in queue.
     * @throws AssertionError Empty queue exception.
     */
    void remove();

}