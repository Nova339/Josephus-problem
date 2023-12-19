//circular linked list generic for Josephus problem
public class LinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    //constructor
    public LinkedList () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //adds data to front
    public void addToFront(T data) {
        Node<T> node = new Node<T> (data);
        if(tail == null) {
            tail = head;
        }
        node.next = head;
        head = node;
        size += 1;
    }

    //adds data to the end
    public void addToEnd(T data) {
        Node<T> node = new Node<T> (data);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size += 1;
    }

    public void deleteFront() {
        if(head == null) {

            return;
        }
        else {
            head = head.getNext();
        }
    }

    public void deleteIndex(T data) {
        Node<T> node = head;
        if (node == null) {
            return;
        }
        if(node.data == data) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node<T> t = node.next;
            if(t.data == data) {
                node.next = t.next;
                break;
            }
            node = node.next;
        }while(node!= head);
        size -= 1;
    }

    public void empty() {
        if(size == 0)
            System.out.println("Is empty");
    }

    public Boolean contains(T data) {
        Node<T> node = head;
        Boolean check = false;

        while(node != null) {
            if(node.data == data) {
                check = true;
            }
            node = node.next;
        }
        return check;
    }

    public void string() {
        Node<T> node = head;

        if(head!=null)
        {
            do {
                System.out.print(node.data + " - ");
                node = node.next;
            } while(node != tail);
        }
        System.out.print(node.data);
    }

    public void eliminations(int numOfPeople, int skip) {

        LinkedList<Integer> temp = new LinkedList<Integer>();

        for(int i = 1; i <= numOfPeople; i++) {
            temp.addToEnd(i);
        }

        System.out.print("Initial puzzle: ");
        temp.string();

        Node<Integer> front = temp.head;
        Node<Integer> back = temp.head;
        int count = 0;
        temp.head = null;
        temp.tail = null;

        while(front.next != front) {
            count = 1;
            while (count != skip) {
                back = front;
                front = front.next;
                count++;
            }
            back.next = front.next;
            front = back.next;
        }
        System.out.println("\nSurvivor: " + front.data);
        temp.head = front;
        temp.tail = front;
    }
}
