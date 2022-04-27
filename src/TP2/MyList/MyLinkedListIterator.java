package TP2.MyList;

public class MyLinkedListIterator<E>{
    private Node<E> current;

    public MyLinkedListIterator(Node<E> head) {
        this.current=head;
    }

    public boolean hasNext() {
        return current!=null;
    }

    public E next() {
        E result = current.value;
        current = current.next;
        return result;
    }

}

