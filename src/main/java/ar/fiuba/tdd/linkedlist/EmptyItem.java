package ar.fiuba.tdd.linkedlist;

public class EmptyItem<T>
        implements Item<T> {

    private Node<T> node;

    public void add(T element) {
        mutate(element).setNode(node).expand();
    }

    private Item<T> mutate(T element) {
        return node.replaceItem(new UsedItem<T>(element));
    }

    public Node<T> setNode(Node<T> node) {
        return (this.node = node);
    }

    public T getElement() {
        throw new AssertionError();
    }

    public int count() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Node<T> getNodeReplacement() {
        throw new AssertionError();
    }
}
