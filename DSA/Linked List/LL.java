public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        node.next = null;
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node; // helps point last node to new node
            tail = node; // tail arrow point to new node
        }
        size++;
    }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.next + " --> ");
            temp = temp.next;
        }

    }

    public void size() {
        System.out.println(size);
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
