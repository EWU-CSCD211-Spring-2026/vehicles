
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

        if (size == 0) {
            addLast(element);
        } else {
            // step 1
            Node<T> newNode = new Node<T>(element);

            // step 2
            Node<T> temp = head.next;

            // step 3
            head.next = newNode;

            // step 4
            newNode.next = temp;

            // step 5
            size++;
        }
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


        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            addLast(element);
        } else if (index == 0) {
            addFirst(element);
        } else {

            // step 3a
            Node<T> newNode = new Node<T>(element);

            // now the logic

            // step 3b
            int curIndex = 1;
            Node<T> cur = head.next;

            // step 3c
            while (curIndex < index) {
                curIndex++;
                cur = cur.next;
            }

            //  step 3d
            Node<T> temp = cur.next;

            // step 3e
            cur.next = newNode;

            // step 3f
            newNode.next = temp;

            // step 3g
            size++;

        }

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

        Node<T> cur = head.next;
        while (cur != null) {
            if (cur.data.equals(element)) {
                return true;
            }
            cur = cur.next;
        }
        return false;

    }

    @Override
    public void removeFirst(T element) {
        throw new RuntimeException("Not Implemented");
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size: " + this.size() + " ");
        sb.append("head: " + head.toString() + " ");
        sb.append("tail: " + tail.toString() + " ");

        Node<T> cur = head.next;

        sb.append("[");
        while (cur != null) {
            sb.append(cur.toString() + ",");
            cur = cur.next;

        }
        sb.append("]");

        return sb.toString();
    }

}
