package ar.fiuba.tdd.linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        head = new Node<T>();
    }

    public void addLast(T element) {
        head.addElement(element);
    }

    /**
     * Retrieves first element in the list.
     * @return First list element.
     * @throws EmptyElementException whenever element retrieve attempt occurs on empty list.
     */
    public T getFirst() throws EmptyElementException {
        return head.getElement();
    }

    public int size() {
        return head.count();
    }

    public boolean isEmpty() {
        return head.isEmpty();
    }

    /**
     * Removes first element in the list.
     * @throws EmptyElementException whenever element remove attempt occurs on empty list.
     */
    public void removeFirst() throws EmptyElementException {
        head = head.getNodeReplacement();
    }
}
