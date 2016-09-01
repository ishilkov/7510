package ar.fiuba.tdd.linkedlist;

public class Node<T> {

    private Node<T> next;

    private Item<T> item;

    public Node() {
        (item = new EmptyItem<T>()).setNode(this);
    }

    public void addElement(T element) {
        item.add(element);
    }

    public Item replaceItem(Item item) {
        return (this.item = item);
    }

    public Node<T> getNextNode() {
        return next;
    }

    public T getElement() throws EmptyElementException {
        return item.getElement();
    }

    public Node<T> expand() {
        return (next = new Node<T>());
    }

    public int count() {
        return item.count();
    }

    public boolean isEmpty() {
        return item.isEmpty();
    }

    public Node<T> getNodeReplacement() throws EmptyElementException {
        return item.getNodeReplacement();
    }
}



