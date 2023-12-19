//Node class file for linkedlist
public class Node <T> {
    T data;
    Node <T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> newNext) {
        this.next = newNext;
    }
}
