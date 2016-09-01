package ar.fiuba.tdd.linkedlist;

public interface Item<T> {

    void add(T element);

    Node<T> setNode(Node<T> node);

    T getElement() throws EmptyElementException;

    int count();

    boolean isEmpty();

    Node<T> getNodeReplacement() throws EmptyElementException;
}
