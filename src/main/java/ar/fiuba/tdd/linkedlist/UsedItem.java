package ar.fiuba.tdd.linkedlist;

public class UsedItem<T>
        implements Item<T> {

    private Node<T> node;

    private T element;

    public UsedItem(T element) {
        this.element = element;
    }

    public void add(T element) {
        node.getNextNode().addElement(element);
    }

    public Node<T> setNode(Node<T> node) {
        return (this.node = node);
    }

    public T getElement() {
        return element;
    }

    public int count() {
        return node.getNextNode().count() + 1;
    }

    public boolean isEmpty() {
        return false;
    }

    public Node<T> getNodeReplacement() {
        return node.getNextNode();
    }
}
