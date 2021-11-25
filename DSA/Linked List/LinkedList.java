
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
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
        /*
         * System.out.println("head : " + head); System.out.println("head.value : " +
         * head.value); System.out.println("head.next : " + head.next);
         * System.out.println("[node] : " + node); System.out.println("[node.value] : "
         * + node.value); System.out.println("[node.next] : " + node.next);
         * System.out.println("tail : " + tail); System.out.println("tail.value : " +
         * tail.value); System.out.println("tail.next : " + tail.next);
         * System.out.println("----------------------------------------------");
         */
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node; // helps point last node to new node
            tail = node; // tail arrow point to new node
        }
        size++;
        /*
         * System.out.println("head : " + head); System.out.println("head.value : " +
         * head.value); System.out.println("head.next : " + head.next);
         * System.out.println("node : " + node); System.out.println("node.value : " +
         * node.value); System.out.println("node.next : " + node.next);
         * System.out.println("tail : " + tail); System.out.println("tail.value : " +
         * tail.value); System.out.println("tail.next : " + tail.next);
         * System.out.println("----------------------------------------------");
         */
    }

    public void insertLast2(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int val, int position) {
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }

    /*
     * delete the last element of the node || a node reference is created called
     * second last and then tail copies everything in secondlast node
     */
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;

        tail = secondLast;
        tail.next = null;

        return val;
    }

    /*
     * Delete any node || we get the reference to previous node of the node we want
     * to remove Now we change the value in prev.next to the node.next value inside
     * the deleting node
     */
    public int delete(int index) {
        index = index - 1;
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;

    }

    // * this will give the reference to the node we want in the linkedlist
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        System.out.print("HEAD --> ");

        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("TAIL");

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
