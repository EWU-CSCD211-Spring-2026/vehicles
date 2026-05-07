
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
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public void addAtIndex(T element, int index) {
        throw new RuntimeException("Not Implemented");
    }

    @Override 
    public int size() {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public boolean contains(T element) {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public void removeFirst(T element) {
        throw new RuntimeException("Not Implemented");
    }



}
