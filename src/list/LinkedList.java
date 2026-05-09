
package list;


public class LinkedList<T> implements List<T> {

    private static class Node<T> {

        public T data;
        public Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
        public Node() {
            this(null, null);
        }
        public Node(T data) {
            this(data, null);
        }
        public Node(Node<T> next) {
            this(null, next);
        }
        @Override
        public String toString() {
            if (data == null) {
                return "null";
            } else {
                return data.toString();
            }
        }

    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {

        this.size = 0;
        this.head = new Node<T>(); // dummy head node
        this.tail = this.head;

    }

    @Override
    public void addFirst(T element) {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public void addLast(T element) {
        // step 1
        Node<T> node = new Node<T>(element);

        // step 2
        this.tail.next = node;

        // step 3
        this.tail = node;

        // step 4
        size++;
    }

    @Override
    public void addAtIndex(T element, int index) {
        throw new RuntimeException("Not Implemented");
    }

    @Override 
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean contains(T element) {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public void removeFirst(T element) {
        throw new RuntimeException("Not Implemented");
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size: " + this.size() + "\n");
        sb.append("head: " + head.toString() + "\n");
        sb.append("tail: " + tail.toString() + "\n");

        Node<T> cur = head.next;

        sb.append("[");
        while (cur != null) {
            sb.append(cur.toString() + ",");
            cur = cur.next;

        }
        sb.append("]");
        sb.append("\n");



        return sb.toString();
    }

}
